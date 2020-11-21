package principal;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import views.MainView;

/**
 * JavaFX GUI_Clock
 */
public class GUI_Clock extends Application {

    @Override
    public void start(Stage stage) {
        MainView viewRoot = new MainView();
        Scene scene = new Scene(viewRoot.getRoot(), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}