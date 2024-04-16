/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author user
 */
public class VistademandadoController implements Initializable {
    public ComboBox cbdemandado;
    ObservableList <String> delitosList = FXCollections.observableArrayList("Estafa", "Robo", "Fraude", "Homicidio", "Secuestro");
    

    @FXML
    void listardelitos(ActionEvent event) {
        Llenarcb(cbdemandado, delitosList);

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
