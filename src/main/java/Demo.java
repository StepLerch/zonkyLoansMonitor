import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.animation.Animation;
import javafx.util.Duration;

@SuppressWarnings("restriction")
public class Demo extends Application {
	private static final String APP_TITLE = "Zonky loans monitor";
	private static final String ROOT_FXML_FILE = "MainPane.fxml";
	
    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane root = FXMLLoader.load(getClass().getResource(ROOT_FXML_FILE));
        Scene scene = new Scene(root);
        primaryStage.setTitle(APP_TITLE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String [] args){
        launch(args);
    }
}
