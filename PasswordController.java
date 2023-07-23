import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PasswordController {

    @FXML
    private Button NewPassword;
    
    @FXML
    private Button SavedPass;

    @FXML
    private Button Logoutbtn;

    @FXML
    void NewOne(ActionEvent event) throws IOException {
        Stage stage = (Stage) NewPassword.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("NewPassword.fxml"));
        primaryStage.setTitle("New Entry");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
        stage.close();
    }

    @FXML
    void OldOnes(ActionEvent event) {

    }

    @FXML
    void LogOut(ActionEvent event) throws IOException{
        Stage stage = (Stage) Logoutbtn.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
        stage.close();
    }

}