package eve.sch.customsoundboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseDragEvent;

public class Controller {
    public Slider columnSlider;
    public Slider rowSlider;

    @FXML

    public void onNewBoardButtonPress(ActionEvent actionEvent) {
        System.out.println("new board pressed");
    }


    public void onLoadBoardButtonPress(ActionEvent actionEvent) {
        System.out.println("load board pressed");
    }


    public void onUpdateColumnCount(MouseDragEvent mouseDragEvent) {
    }


    public void onUpdateRowCount(MouseDragEvent mouseDragEvent) {
    }


    public void onCreateBoardButtonPress(ActionEvent actionEvent) {
    }
}