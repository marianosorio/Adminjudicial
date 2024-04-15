/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class EntradaViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            
        // TODO
    }   
     private void cambiarAVistaSiguiente(ActionEvent event) throws IOException {
        // Cargar la vista siguiente desde el archivo FXML
        Parent vistaSiguienteParent = FXMLLoader.load(getClass().getResource("SiguienteVista.fxml"));
        Scene vistaSiguienteScene = new Scene(vistaSiguienteParent);

        // Obtener el Stage actual (ventana)
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        // Configurar la nueva escena en el Stage
        window.setScene(vistaSiguienteScene);
        window.show();
     }
    
}
