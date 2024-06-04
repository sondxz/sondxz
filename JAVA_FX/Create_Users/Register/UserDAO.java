package Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	public static User checkUser(String email) {
		String jdbcURL = "jdbc:ucanaccess://lib/QLNS.accdb";
		String jdbcUser = "";
		String jdbcPass = "";

		User user = null;
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection con = DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPass);
			String sql = "SELECT * from tbluser WHERE email = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			// để trỏ qua câu lệnh tiếp theo

			if (rs.next()) {
				user = new User(email, rs.getString("fullname"));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("không kết nối database");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("không kết nối database 2");
		}
		return user;
	}

	public static boolean addUser(User user) {
		String jbdcURL = "jdbc:ucanaccess://lib/QLNS.accdb";
		String jdbcUser = "";
		String jdbcPass = "";

		boolean rowInserted = false;
		try {
			Class.forName("net.ucanaccess.jbdc.UcanaccessDriver");
			Connection connection = DriverManager.getConnection(jbdcURL, jdbcUser, jdbcPass);
			String sql = "INSERT INTO tbluser (email, fullname) values(?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, user.getEmail());
			statement.setString(2, user.getFullName());

			rowInserted = statement.executeUpdate() > 0;
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rowInserted;
	}
	public static List<User> listAllUsers() {
		List<User> listBook = new ArrayList<>();
			String sql = "SELECT * FROM tblusers";
			String jdbcURL = "jdbc:ucanaccess://lib/QLNS.accdb";
			String dbUsers = "";
			String dbPassword = "";
			try {
				Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
				Connection connection = DriverManager.getConnection(jdbcURL, dbUsers, dbPassword);
				
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sql);
				
				while(resultSet.next()) {
					String email = resultSet.getString("email");
					String fullname = resultSet.getString("fullname");
					
					User user = new User(email , fullname);
					listBook.add(user);
				}
				
				resultSet.close();
				statement.close();
				connection.close();
			} catch (ClassNotFoundException  | SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		
		return listBook;
	}
}
