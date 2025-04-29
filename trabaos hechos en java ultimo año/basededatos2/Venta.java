
package basededatos2;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Venta {
    Scanner input = new Scanner (System.in);
    
    PreparedStatement ps;
    ResultSet rs;
    
    public void venta() {
        
        int id, venta, precio_unitario, total, stock, resultado;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            System.out.println("ingrese el código del producto: ");
            id=input.nextInt();
            
            ps=conexion.prepareStatement("select * from productos where id="+id);
            rs=ps.executeQuery();
            
            System.out.println("ingrese la cantidad que se vendio: ");
            venta = input.nextInt();
            
            if(rs.next()) {
                if(rs.getInt("stock") > venta) {
                    stock = rs.getInt("stock");
                    precio_unitario = rs.getInt("precio_unitario");
                    total = precio_unitario * venta;
                    stock -= venta;
                    
                    ps=conexion.prepareStatement("update productos set stock =? where id=?");
                    ps.setInt(1, stock);
                    ps.setInt(2, id);
                    resultado=ps.executeUpdate();
                    
                    System.out.println("\nel gasto final es de: $"+total+" pesos");
                    
                } else {
                    System.out.println("\nstock insufuciente, no se puede generar la venta");
                }
            } else {
                System.out.println("no existe el registro");
            }
            conexion.close();
        } catch (Exception ex) {
            System.out.println("error: "+ ex);
        }
    }
}
