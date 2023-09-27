package eve.sch.customsoundboard.Model;

import eve.sch.customsoundboard.View.Application;
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
        Application.loadFXMLScene("board_creation_menu.fxml");
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
        // Create a new standalone stage with (columnSlider * rowSlider) buttons in a new window
        new SoundBoardStage((int) columnSlider.getValue(), (int) rowSlider.getValue());
    }
}