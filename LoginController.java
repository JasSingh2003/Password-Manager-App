import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private Label lbl;

    @FXML
    private TextField PasswordEntered;

    @FXML
    private TextField UsernameEntered;

    @FXML
    private Button back;

    @FXML
    private Button loginBtn;

    @FXML
    void BackScreen(ActionEvent event) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
        stage.close();
    }

    @FXML
    void LogIN(ActionEvent event) throws IOException {
        String enteredUsername = UsernameEntered.getText();  // Replace with actual entered username
        String enteredPassword = PasswordEntered.getText();
        boolean isAuthenticated = false;
        String UsernameEnter = UsernameEntered.getText();
        String PasswordEnter = PasswordEntered.getText();
        if(!UsernameEnter.isEmpty() || !PasswordEnter.isEmpty()){
            // Read the username file
            BufferedReader usernameReader = new BufferedReader(new FileReader("Credentials.txt"));
            String storedUsername;

            while ((storedUsername = usernameReader.readLine()) != null) {
                // Check if the entered username matches the stored username
                if (enteredUsername.equals(storedUsername)) {
                    // Read the password file
                    BufferedReader passwordReader = new BufferedReader(new FileReader("Passwords.txt"));
                    String storedPassword;

                    while ((storedPassword = passwordReader.readLine()) != null) {
                        // Check if the entered password matches the stored password
                        if (enteredPassword.equals(storedPassword)) {
                            isAuthenticated = true;
                            break;
                        }
                    }

                    passwordReader.close();
                    break;
                }
            }

            usernameReader.close();

        if (isAuthenticated) {
            Stage stage = (Stage) back.getScene().getWindow();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("PasswordManager.fxml"));
            primaryStage.setTitle("Welcome");
            primaryStage.setScene(new Scene(root, 600,400));
            primaryStage.show();
            stage.close();
        } else {
            
            lbl.setText("Invalid username or password");
        }
    }
    //if login pressed without details.s
    else{ 
        lbl.setText("Enter both Username and Password");
    }
    }

    @FXML
    void PassEntered(ActionEvent event) {
        
    }

    @FXML
    void UserName(ActionEvent event) {   
    }
}
