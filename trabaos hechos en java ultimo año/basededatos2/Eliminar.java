

package basededatos2;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Eliminar {
    
    public void delet() {
        Scanner input = new Scanner (System.in);
        
        PreparedStatement ps;
        ResultSet rs;
        
        int cod, resultado;
        char confirmacion;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            System.out.println("ingrese el código del producto a eliminar: ");
            cod = input.nextInt();
            
            ps = conexion.prepareStatement("select * from productos where id="+cod);
            rs = ps.executeQuery();
            
            if(rs.next()) {
                System.out.println("seguro que quiere eliminalo? S/N");
                confirmacion = input.next().charAt(0);
                
                if(confirmacion == 's' || confirmacion == 'S') {
                    ps=conexion.prepareStatement("delete from productos where id="+cod);
                    resultado=ps.executeUpdate();
                
                    System.out.println("id: "+rs.getInt("id")+"\nproducto: "+rs.getString("producto")+"\nstock: "+rs.getString("stock")+"\nprecio unitario: "+rs.getInt("precio_unitario"));
                    System.out.println("datos eliminados");
                
                    conexion.close();
                } else {
                    conexion.close();
                }
            }
            
        } catch (Exception ex) {
            System.out.println("error: "+ex);
        }
        
        
        
    }
}
