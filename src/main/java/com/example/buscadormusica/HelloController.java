package com.example.buscadormusica;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class HelloController {
    ProductoController control;


    @FXML
    private TextField txPalabra;
    @FXML
    private Button btnObtener;
    @FXML
    private TableColumn clAutor;
    @FXML
    private TableColumn clNombre;
    @FXML
    private TableView table;

    ObservableList<CancionesModelo> datos;

    public  void  pintarDatos(){
        this.clNombre.setCellValueFactory(new PropertyValueFactory<>("title"));
        datos=control.getDatos();
        this.table.setItems(datos);
    }


    @FXML
    public void obtener(ActionEvent actionEvent) {
        control=new ProductoController(txPalabra.getText());
        control.start();
        pintarDatos();
    }
}