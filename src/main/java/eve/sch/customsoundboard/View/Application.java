package eve.sch.customsoundboard.View;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    private static FXMLLoader fxmlLoader;
    private static Scene scene;
    private static Stage appStage;


    @Override
    public void start(Stage stage) throws IOException {
        appStage = stage;
        fxmlLoader = new FXMLLoader(Application.class.getResource("main_menu.fxml"));
        scene = new Scene(fxmlLoader.load());
        appStage.setTitle("Main Menu");
        appStage.setScene(scene);
        appStage.show();
    }


    public static void main(String[] args) {
        launch();
    }


    public static void loadBoardCreationMenu() throws IOException {
        fxmlLoader = new FXMLLoader(Application.class.getResource("board_creation_menu.fxml"));
        scene = new Scene(fxmlLoader.load());
        appStage.setTitle("Board Creation Menu");
        appStage.setScene(scene);
    }
}