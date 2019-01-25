import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Launch extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    MainScreenController mainScreenController;

    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("MainScreen.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Back-up");
        stage.show();
        mainScreenController = loader.getController();
        mainScreenController.mainScreenStage = stage;
    }

}
