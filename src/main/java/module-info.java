module eve.sch.customsoundboard {
    requires javafx.controls;
    requires javafx.media;
    requires javafx.fxml;


    exports eve.sch.customsoundboard.View;
    opens eve.sch.customsoundboard.View to javafx.fxml;
    exports eve.sch.customsoundboard.Model;
    opens eve.sch.customsoundboard.Model to javafx.fxml;
}