package eve.sch.customsoundboard;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.io.IOException;

public class MenuController {
    public Slider columnSlider;
    public Slider rowSlider;
    public Label columnLabel;
    public Label rowLabel;

    @FXML

    public void onNewBoardButtonPress() throws IOException {
        System.out.println("new board pressed");
        Application.loadBoardCreationMenu();
    }


    public void onLoadBoardButtonPress() {
        System.out.println("load board pressed");
    }


    public void onUpdateColumnCount() {
        int number = (int) columnSlider.getValue();
        columnLabel.setText(number + " Column(s)");
    }


    public void onUpdateRowCount() {
        int number = (int) rowSlider.getValue();
        rowLabel.setText(number + " Row(s)");
    }


    public void onCreateBoardButtonPress() {
    }
}