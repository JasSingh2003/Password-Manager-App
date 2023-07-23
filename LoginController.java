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
        //void LogIN(ActionEvent event) throws IOException {
            String enteredUsername = UsernameEntered.getText();
            String enteredPassword = PasswordEntered.getText();
            boolean isAuthenticated = false;
        
            if (!enteredUsername.isEmpty() && !enteredPassword.isEmpty()) {
                // Read the credentials file
                BufferedReader credentialsReader = new BufferedReader(new FileReader("Credentials.txt"));
                String line;
        
                while ((line = credentialsReader.readLine()) != null) {
                    String[] credentials = line.split(",");
                    String storedUsername = credentials[0];
                    String storedPassword = credentials[1];
        
                    // Check if the entered username and password match the stored credentials
                    if (enteredUsername.equals(storedUsername) && enteredPassword.equals(storedPassword)) {
                        isAuthenticated = true;
                        break;
                    }
                }
        
                credentialsReader.close();
        
                if (isAuthenticated) {
                    // Successful login logic
                } else {
                    lbl.setText("Invalid username or password");
                }
            } else { 
                lbl.setText("Enter both Username and Password");
            }
        
        
       

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
    

    @FXML
    void PassEntered(ActionEvent event) {
        
    }

    @FXML
    void UserName(ActionEvent event) {   
    }
}
