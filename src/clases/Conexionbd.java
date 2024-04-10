
 
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

// Prueba 3, conexión BD
public class conexionsql {
  public class conexionsql {

	Connection conn = null;
	String url = "jdbc:postgresql://localhost/adminprueba";
	String usuario = "postgres";
	String clave = "Kiernan.14";
	
	
	public void conectar() {
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, usuario, clave);
			JOptionPane.showInputDialog(null, "Conexion exitosa con la base de datos", "Conexion", JOptionPane.INFORMATION_MESSAGE);
			
		}catch(Exception e) {
			JOptionPane.showInputDialog(null, "No se ha podido conectar con la base de datos" + e, "Conexion", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void cierre(){
		try {
			conn.close();
			JOptionPane.showInputDialog(null, "Se ha desconectado de la base de datos", "Desconexion", JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception e){
			JOptionPane.showInputDialog(null, "No se ha podido desconectar con la base de datos" + e, "Desconexion", JOptionPane.ERROR_MESSAGE);
			
			
		}
		
	}
  
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
     /*Connection conectar = null;
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
    }*/
  
}
