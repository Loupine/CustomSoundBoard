module eve.sch.customsoundboard {
    requires javafx.controls;
    requires javafx.fxml;


    opens eve.sch.customsoundboard to javafx.fxml;
    exports eve.sch.customsoundboard;
}