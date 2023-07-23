import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewController {

    @FXML
    private TextField Passwrd;

    @FXML
    private TextField PlatName;

    @FXML
    private Button back;

    @FXML
    private Button clearbtn;

    @FXML
    private Button savebtn;

    @FXML
    void BackScrn(ActionEvent event) throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("PasswordManager.fxml"));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();
        stage.close();
    }

    @FXML
    void ClearPassFields(ActionEvent event) {
        Passwrd.clear();
    }

    @FXML
    void ClearPlatFields(ActionEvent event) {
        PlatName.clear();
    }

    @FXML
    void SaveCreds(ActionEvent event) {
        
    }

}


