package eve.sch.customsoundboard.Model;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;

public class SoundBoardStage extends Stage {

    private final int columns;
    private final int rows;
    private final ArrayList<Button> buttonArrayList = new ArrayList<>();
    private final VBox rowVBox = new VBox();
    private final DirectoryChooser directoryChooser = new DirectoryChooser();
    private File mainDirectory;


    public SoundBoardStage(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;

        chooseMainDirectory();
        prepareStage();
        show();
    }


    private void chooseMainDirectory() {
        directoryChooser.setTitle("Choose A Directory Containing Sound Files");
        File chosenDirectory = directoryChooser.showDialog(new Stage());
        if(chosenDirectory != null) {
            mainDirectory = chosenDirectory;
        }
    }


    private void prepareStage() {
        initializeButtons();
        addHBoxesOfButtons();
        setScene(new Scene(rowVBox));
        setTitle("CustomBoard");
        centerOnScreen();
    }


    private void initializeButtons() {
        int totalButtons = columns * rows;

        for(int i = 0; i < totalButtons; i++) {
            // If mainDirectory is specified, pass it to the button
            Button newButton = mainDirectory != null ? new ModifiableSoundButton(mainDirectory) : new ModifiableSoundButton();
            buttonArrayList.add(newButton);
        }
    }


    private void addHBoxesOfButtons() {
        rowVBox.setAlignment(Pos.CENTER);

        for(int rowIndex = 0; rowIndex < rows; rowIndex++) {
            HBox currentHBox = new HBox();
            rowVBox.getChildren().add(currentHBox);
            assignButtonsToHBox(currentHBox, rowIndex);
        }
    }


    private void assignButtonsToHBox(HBox currentHBox, int rowIndex) {
        int buttonIndex = rowIndex * columns;

        for(int columnIndex = 0; columnIndex < columns; columnIndex++) {
            currentHBox.getChildren().add(buttonArrayList.get(buttonIndex));
            buttonIndex++;
        }
    }

}
