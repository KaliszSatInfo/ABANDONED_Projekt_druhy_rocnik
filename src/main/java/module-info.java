module com.example.projekt_druhy_rocnik {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.projekt_druhy_rocnik to javafx.fxml;
    exports com.example.projekt_druhy_rocnik;
}