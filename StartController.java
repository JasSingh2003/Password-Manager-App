import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartController {

    @FXML
    private Button Login;

    @FXML
    private Button Signup;

    @FXML
    void LogIn(ActionEvent event) throws IOException {
        Stage stage = (Stage) Login.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
        stage.close();
    }

    @FXML
    void SignUp(ActionEvent event) throws IOException {
        Stage stage = (Stage) Signup.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Signup.fxml"));
        primaryStage.setTitle("Signup Page");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
        stage.close();
    }
    @FXML
    void ExitApp(ActionEvent event) throws IOException{
        Stage stage = (Stage) Signup.getScene().getWindow();
        stage.close();
    }
}
