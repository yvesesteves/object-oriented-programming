module com.example.ex2_exemplo04 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ex2_exemplo04 to javafx.fxml;
    exports com.example.ex2_exemplo04;
}