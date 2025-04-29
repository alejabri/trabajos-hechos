package basededatos2;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StockBajo {
    
    PreparedStatement ps;
    ResultSet rs;
    
    public void stockMinimo() {
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();

            ps = conexion.prepareStatement("select * from productos");
            rs = ps.executeQuery();
            
            while(rs.next()) {
                if(rs.getInt("stock") < 10) {
                System.out.println("\nel producto "+rs.getString("producto")+" tiene un stock bajo de "+rs.getInt("stock"));
                }
            }
            
            conexion.close();
        } catch (Exception ex) {
            System.out.println("error:"+ex);
        }
        
        
    }
}
