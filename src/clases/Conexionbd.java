/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Conexionbd {
  /*  public static Connection getConnection(){
        String cadena = "jdbc:sqlserver://localhost:1433;"
                + "database=dbSistema;"
                + "user=user1;"
                + "password=kiernan;"
                + "loginTimeout=10";
        
        try{
            Connection con = DriverManager.getConnection(cadena);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        
        }
                
       
        
    }*/
     Connection conectar = null;
    String user ="user1";
    String contra = "kiernan";
    String bd = "dbSistema";
    String puerto = "1433";
    String ip = "localhost";
    
    String cadena = "jdbc:sqlserver://"+ip+":"+puerto+"/"+bd;
    
    public Connection GestorConexion(){
        try{
           String cadena = "jdbc:sqlserver://localhost:"+puerto+";"+"databaseName="+bd;
           conectar = DriverManager.getConnection(cadena, user, contra);
           JOptionPane.showMessageDialog(null, "Se ha conectado correctamente a la base de datos");
            
        }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos, error: " + e.toString());
            
        }
        return conectar;
    }
}
