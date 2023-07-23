import java.io.BufferedWriter;
import java.io.FileWriter;
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

public class SignupController {

    @FXML
    private TextField SPassword;

    @FXML
    private TextField SUsername;

    @FXML
    private Button back;

    @FXML
    private Button signupbtn;

    @FXML
    private Label errormsg;

    @FXML
    void BackBtn(ActionEvent event) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
        stage.close();
    }

    @FXML
    boolean SUsernameEntered(ActionEvent event) throws IOException{
        if(SUsername.getText().length() > 4){
            return true;
        }
        return false;
    }

    @FXML
         boolean SPasswordEntered(ActionEvent event) throws IOException {  
            if (SPassword.getText().length() >= 8) {
                BufferedWriter writer = new BufferedWriter(new FileWriter("Credentials.txt", true));
                writer.write(SUsername.getText() + "," + SPassword.getText() + "\n");
                writer.close();
                return true;
            } else {
                return false;
            }
        }
        

    @FXML
    void SignUp(ActionEvent event) throws IOException {
        if(SPasswordEntered(event)){

            Stage stage = (Stage) back.getScene().getWindow();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("PasswordManager.fxml"));
            primaryStage.setTitle("Welcome");
            primaryStage.setScene(new Scene(root, 600,400));
            primaryStage.show();
            stage.close();
            }
            else if(!SPasswordEntered(event)){
               errormsg.setText("Password must be atleat 8 characters long.");
            }
            else if(!SUsernameEntered(event)){
                errormsg.setText("Username must be atleat 4 characters long.");
            }
            
    }
}


