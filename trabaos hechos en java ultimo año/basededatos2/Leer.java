package basededatos2;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Leer {
    PreparedStatement ps;
    ResultSet rs;
    
    public void leer() {
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select * from productos");
            rs = ps.executeQuery();
            int band = 0;
            
            System.out.println("\ncodigo | producto | stock | precio unitario");
            
            while(rs.next()) {
                band = 1;
                
                System.out.println(rs.getInt("id")+"      | "+rs.getString("producto")+"    | "+rs.getInt("stock")+"    | "+rs.getInt("precio_unitario"));
            }
            
            if(band == 0) {
                System.out.println("no existen registro");
            }
            
            conexion.close();
        } catch(Exception ex) {
            System.out.println("error: "+ex);
        }
    }
}
