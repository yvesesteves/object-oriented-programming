module com.example.lab02_ex4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab02_ex4 to javafx.fxml;
    exports com.example.lab02_ex4;
}