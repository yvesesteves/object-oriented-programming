module com.example.lab02_ex2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab02_ex2 to javafx.fxml;
    exports com.example.lab02_ex2;
}