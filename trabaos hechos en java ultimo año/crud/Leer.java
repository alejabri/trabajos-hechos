package crud;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement; //ejecuta los codigos sql
import java.sql.ResultSet; //ejecuta los select

public class Leer {
    PreparedStatement ps;
    ResultSet rs;
    
    public void leerTable() {
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select * from alumno"); //ejecuta la consulta
            rs = ps.executeQuery();//executeUpdate() para eliminar o modificar la base de la base de datos
            int band=0;
            
            while(rs.next()) {
                band=1;
                System.out.println("Codigo: "+rs.getInt("id")+"\nNombre: "+rs.getString("nombre")+"\nApellido: "+rs.getString("apellido")+"\nEdad: "+rs.getInt("edad")+"\n");
            }
            
            if(band==0) {
                System.out.println("no existe registro");
            }
            
            conexion.close();
        } catch(Exception ex) {
            System.out.println("error: "+ex);
        }
    }
}
