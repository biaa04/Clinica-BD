module com.example.clinicabd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clinicabd to javafx.fxml;
    exports com.example.clinicabd;
    exports com.example.clinicabd.Controller;
    opens com.example.clinicabd.Controller to javafx.fxml;
}