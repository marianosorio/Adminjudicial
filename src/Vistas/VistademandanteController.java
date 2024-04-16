/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Vistas;

import static adminjudicial.AdminJudicial.Llenarcb;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class VistademandanteController {
    
    public ComboBox cbdemandante;
    ObservableList <String> delitosList = FXCollections.observableArrayList("Estafa", "Robo", "Fraude", "Homicidio", "Secuestro");
    

    @FXML
    void listardelitos(ActionEvent event) {
        Llenarcb(cbdemandante, delitosList);

    }
    

}

