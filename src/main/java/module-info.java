module com.aptech.testloginfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens com.aptech.testloginfx to javafx.fxml;
    exports com.aptech.testloginfx;
}