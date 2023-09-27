package eve.sch.customsoundboard.View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    private static Stage appStage;


    @Override
    public void start(Stage stage) throws IOException {
        appStage = stage;
        appStage.setTitle("CustomSoundBoard");
        loadFXMLScene("main_menu.fxml");
        appStage.show();
    }


    public static void main(String[] args) {
        launch();
    }


    public static void loadFXMLScene(String resourceName) throws IOException {
        FXMLLoader loader = new FXMLLoader(Application.class.getResource(resourceName));
        appStage.setScene(new Scene(loader.load()));
    }
}