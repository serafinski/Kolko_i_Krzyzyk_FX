module com.example.manager_hasel_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.manager_hasel_fx to javafx.fxml;
    exports com.example.manager_hasel_fx;
}