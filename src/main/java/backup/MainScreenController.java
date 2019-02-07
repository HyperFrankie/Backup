package backup;

import backup.Kernel.Config;
import backup.Kernel.Database;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainScreenController {

    public Stage mainScreenStage;
    public Config config;

    @FXML
    public ImageView homeButton, backupTasksButton, currentStateButton;
    @FXML
    public AnchorPane mainScreenCenterPane;

    @FXML
    public void initialize() throws SftpException, JSchException {
//        config = new Config();
        Database db = new Database();

        Image image = GUIUtil.getImageFromResourcePath("/backup/GUI/images/Home.png");
        homeButton.setImage(image);
        backupTasksButton.setImage(image);
        currentStateButton.setImage(image);

//        Tile testTile = new Tile(Tile.SkinType.BAR_CHART);
//        testTile.setTitle("Test Title");
//        testTile.setTitleAlignment(TextAlignment.CENTER);
//        testTile.addChartData(new ArrayList<ChartData>() {{
//            add(new ChartData("Data 1", 14.1d, Color.GREENYELLOW));
//            add(new ChartData("Data 2", 23.5d, Color.AQUA));
//        }});
//        testTile.getChartData().get(0).setAnimated(true);
//        testTile.setPrefSize(300, 300);
//        testTile.setAutoScale(true);
//        mainScreenCenterPane.getChildren().add(testTile);
    }

}
