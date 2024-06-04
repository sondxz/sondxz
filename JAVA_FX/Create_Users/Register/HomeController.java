package Register;

import java.awt.Label;
import java.awt.TextField;
import java.util.ResourceBundle;

import javax.print.DocFlavor.URL;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HomeController {
	@FXML
	private Label loginFullname;
	
	@FXML
	private TableView<User> userListTV;
	
	@FXML
	private TableColumn<User, String> emailCol;
	
	@FXML
	private TableColumn<User, String> fullnameCol;
	
	@FXML
	private TextField emailH;
	
	@FXML
	private TextField fullnameH;
	
	@FXML
	private Label Exit;
	
	private UserDAO um;
	
	private User loginUsers;
	
	public User getLoginUsers () {
		return loginUsers;
	}
	
	public void setLoginUsers (User loginUsers) {
		this.loginUsers = loginUsers;
	}
	
	public void initialize(URL loacation, ResourceBundle resources) {
		Platform.runLater(() -> {
			loginFullname.setText(loginUsers.getFullName());
		});
		
		
	}
	@FXML
	public void onClickExit() {
		
	}
	@SuppressWarnings("unchecked")
	public void onClickAdd () {
		
	}
	@SuppressWarnings("unchecked")
	public void onClickFix() {

	}
	@SuppressWarnings("unchecked")
	public void onClickDel() {

	}
}
