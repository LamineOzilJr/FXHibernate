package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import tools.Notification;

public class MainController {
	
	@FXML
	private TextField emailtxt;
	@FXML
	private PasswordField passwordtxt;
	
	
	public void login(ActionEvent event) {
		String email = emailtxt.getText().toString();
		String password = passwordtxt.getText().toString();
		
		Notification.NotifSucces("Message", email +  "  " + password);
	}
	
	
	
}
