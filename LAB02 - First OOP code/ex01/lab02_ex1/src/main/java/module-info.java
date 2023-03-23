module com.example.lab02_ex1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.lab02_ex1 to javafx.fxml;
    exports com.example.lab02_ex1;
}