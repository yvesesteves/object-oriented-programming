module com.example.lab02_ex5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab02_ex5 to javafx.fxml;
    exports com.example.lab02_ex5;
}