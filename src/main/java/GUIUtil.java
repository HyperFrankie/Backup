import javafx.scene.image.Image;

public class GUIUtil {

    public static Image getImageFromResourcePath(String path) {
        return new Image(Launch.class.getResource(path).toString());
    }

}