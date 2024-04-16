/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package adminjudicial;

import Vistas.EntradaViewController;
import Vistas.VistademandanteController;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class AdminJudicial extends Application {
    public static Stage currentStage;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/Vistas/Vistademandante.fxml")));
        primaryStage.setTitle("Vista de la entrada");
        primaryStage.setScene(new Scene (root, 743, 613));
        primaryStage.show();
        currentStage = primaryStage;
        
    }
    
    
    
    
    public static void closeWindows(Stage stage){stage.close();}
    
    public static void Llenarcb(ComboBox<String> llenarcb, ObservableList<String> infocombo){
        llenarcb.setItems(infocombo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        launch(args);
    }
    
}
