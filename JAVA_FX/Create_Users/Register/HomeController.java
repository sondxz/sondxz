package Register;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
	
	@FXML 
	private Label welcomeMsg;
	
	@FXML
	private void onClickExit() {
		//từ thành phần con dò ra (cửa cổ)
		welcomeMsg.getScene().getWindow().hide();
	}
	
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
