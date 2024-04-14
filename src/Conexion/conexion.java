/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class conexion {
    Connection connection = null;
    
    String user ="postgres";
    String contra = "Kiernan.14";
    String bd = "SistemaJudicial";
    String puerto = "5432";
    String ip = "localhost";

    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+bd;

    public Connection GestorConexion(){
        try{
            Class.forName("org.postgresql.Driver"); 
            
           connection = DriverManager.getConnection(cadena, user, contra);
           JOptionPane.showMessageDialog(null, "Se ha conectado correctamente a la base de datos");

        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos, error: " + e.toString());

        }
        return connection;
    }
    
    
}
