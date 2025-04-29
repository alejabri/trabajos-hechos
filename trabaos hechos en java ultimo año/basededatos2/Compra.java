package basededatos2;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Compra {
    Scanner input = new Scanner (System.in);
    
    PreparedStatement ps;
    ResultSet rs;
    
    public void venta() {
        
        int id, compra, stock, resultado;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            System.out.println("ingrese el código del producto: ");
            id=input.nextInt();
            
            ps=conexion.prepareStatement("select * from productos where id="+id);
            rs=ps.executeQuery();
            
            System.out.println("ingrese la cantidad que se compro: ");
            compra = input.nextInt();
            
            if(rs.next()) {
                
                stock = rs.getInt("stock");
                stock += compra;

                ps=conexion.prepareStatement("update productos set stock =? where id=?");
                ps.setInt(1, stock);
                ps.setInt(2, id);
                resultado=ps.executeUpdate();

                System.out.println("\nstock actualizado");
            
            } else {
                System.out.println("no existe el registro");
            }
            conexion.close();
        } catch (Exception ex) {
            System.out.println("error: "+ ex);
        }
    }
}
