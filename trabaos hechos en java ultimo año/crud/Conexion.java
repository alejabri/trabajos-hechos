package crud;

import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Driver;
import java.sql.DriverManager;

public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/java";
    public static final String usuario = "root";
    public static final String contrasenna = "";
    
    public Connection getConnection() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //convierte conexion en uno tipo Connection que luego se le pasa los valores para conectar a la base de datos
            conexion=(Connection)DriverManager.getConnection(URL,usuario,contrasenna);
            //catch marca si hay algun error en la conexion
        }catch(Exception ex) { 
            System.out.println("error: "+ex);
        }
        return conexion;
    }
    
}
