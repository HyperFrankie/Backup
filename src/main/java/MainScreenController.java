import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.chart.ChartData;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.time.Instant;
import java.util.ArrayList;

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

        Tile testTile = new Tile(Tile.SkinType.BAR_CHART);
        testTile.setTitle("Test Title");
        testTile.setTitleAlignment(TextAlignment.CENTER);
        testTile.addChartData(new ArrayList<ChartData>() {{
            add(new ChartData("Data 1", 14.1d, Color.GREENYELLOW));
            add(new ChartData("Data 2", 23.5d, Color.AQUA));
        }});
        testTile.getChartData().get(0).setAnimated(true);
        testTile.setPrefSize(300, 300);
        testTile.setAutoScale(true);
        mainScreenCenterPane.getChildren().add(testTile);
    }

}
