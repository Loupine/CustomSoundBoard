package eve.sch.customsoundboard.Model;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SoundBoardStage extends Stage {

    private final int columns;
    private final int rows;
    private final ArrayList<Button> buttonArrayList = new ArrayList<>();
    private final VBox rowVBox = new VBox();


    public SoundBoardStage(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
        this.setScene(new Scene(rowVBox));
        this.setTitle("CustomBoard");
        this.centerOnScreen();

        initializeButtons();
        addHBoxesOfButtons();
        this.show();
    }


    private void initializeButtons() {
        int totalButtons = columns * rows;

        for(int i = 0; i < totalButtons; i++) {
            Button newButton = new Button("Button" + i);
            newButton.setFont(new Font(12));
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
