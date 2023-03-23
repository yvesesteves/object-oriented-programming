module com.example.lab02_ex3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab02_ex3 to javafx.fxml;
    exports com.example.lab02_ex3;
}