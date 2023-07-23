import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
 
public class PasswordExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }
   
    @Override
    public void start(Stage primaryStage) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
       Scene scene = new Scene(root);

       primaryStage.setTitle("Welcome");
       primaryStage.setScene(scene);
       primaryStage.show();
    }
}