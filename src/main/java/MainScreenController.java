import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainScreenController {

    public Stage mainScreenStage;

    @FXML
    public ImageView homeButton, backupTasksButton, currentStateButton;

    @FXML
    public void initialize() {
        Image image = GUIUtil.getImageFromResourcePath("/images/GUI/Home.png");
        homeButton.setImage(image);
        backupTasksButton.setImage(image);
        currentStateButton.setImage(image);
    }

}
