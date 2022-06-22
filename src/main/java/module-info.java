module com.example.manager_hasel_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tic_tac_toe_fx to javafx.fxml;
    exports com.example.tic_tac_toe_fx;
}