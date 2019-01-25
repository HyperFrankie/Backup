import eu.hansolo.tilesfx.Tile;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import eu.hansolo.tilesfx.skins.

public class MainScreenController {

    public Stage mainScreenStage;

    @FXML
    public ImageView homeButton, backupTasksButton, currentStateButton;
    @FXML
    public AnchorPane mainScreenCenterPane;

    @FXML
    public void initialize() {
        Image image = GUIUtil.getImageFromResourcePath("/images/GUI/Home.png");
        homeButton.setImage(image);
        backupTasksButton.setImage(image);
        currentStateButton.setImage(image);
        mainScreenCenterPane.getChildren().add((new Tile(Tile.SkinType.DONUT_CHART)));
    }

}
