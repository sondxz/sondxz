package Register;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterController {
	@FXML
	TextField EmailTF;
	@FXML
	TextField FullnameTF;
	@FXML
	Label msg;

	@FXML
	public void onClickRegisterButton() {
		System.out.println("email" + ": " + EmailTF.getText());
		System.out.println("name" + ": " + FullnameTF.getText());

		User user = UserDAO.checkUser(EmailTF.getText());

		if (user != null) {
			msg.setText("cant sign up, your email was existed");
			System.out.println(user.toString());
		} else {

//			// add vao csdl
//			userDAO.addUser(new User(email.getText(), name.getText()));
//			// đóng cửa sổ hiện tại
			EmailTF.getScene().getWindow().hide();
//			// mở cứa sổ home

			goHomeScreen();

		}

	}

	private void goHomeScreen() {

		try {
			Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));

			// thêm layout vào scene
			Scene scene = new Scene(root);

			// thêm scene vào stage
			Stage homeStage = new Stage();
			homeStage.setScene(scene);
			homeStage.setTitle("Home");

			// hiển thị stage
			homeStage.show();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Không hiển thị menu được");
		}

	}

}
