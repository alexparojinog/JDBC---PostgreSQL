module com.example.studentrecordsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires com.dlsc.formsfx;

    opens com.example.studentrecordsystem to javafx.fxml;
    exports com.example.studentrecordsystem;
}