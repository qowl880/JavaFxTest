module com.highform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.highform to javafx.fxml;
    exports com.highform;
}