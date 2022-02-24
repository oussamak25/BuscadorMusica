module com.example.buscadormusica {
    requires javafx.controls;
    requires javafx.fxml;
    requires retrofit2;
    requires gson;
    requires retrofit2.converter.gson;
    requires java.sql;

    opens com.example.buscadormusica to javafx.fxml, gson;
    exports com.example.buscadormusica;
}