package fxml;

import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MyController {
	@FXML
	private TextField tf;
	
	@FXML 
	public void showDateTime() {
		//Xu li su kien khi bam nut
		tf.setText(new Date() .toString());
	}
}
