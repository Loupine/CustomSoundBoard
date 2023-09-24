package eve.sch.customsoundboard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Controller {
    public Slider columnSlider;
    public Slider rowSlider;
    public Label columnLabel;
    public Label rowLabel;

    @FXML

    public void onNewBoardButtonPress(ActionEvent actionEvent) throws IOException {
        System.out.println("new board pressed");
        Application.loadBoardCreationMenu();
    }


    public void onLoadBoardButtonPress(ActionEvent actionEvent) {
        System.out.println("load board pressed");
    }


    public void onUpdateColumnCount(MouseEvent mouseEvent) {
        int number = (int) columnSlider.getValue();
        columnLabel.setText(number + " Column(s)");
    }


    public void onUpdateRowCount(MouseEvent mouseEvent) {
        int number = (int) rowSlider.getValue();
        rowLabel.setText(number + " Row(s)");
    }


    public void onCreateBoardButtonPress(ActionEvent actionEvent) {
    }
}