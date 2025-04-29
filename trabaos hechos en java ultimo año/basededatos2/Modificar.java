package basededatos2;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Modificar {
    
    public void mod() {
        Scanner input = new Scanner (System.in);
        
        PreparedStatement ps;
        ResultSet rs;
        
        int cod, stock, resultado, precio_unitario;
        String producto;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            System.out.println("ingrese el código del producto a modificar: ");
            cod=input.nextInt();
            
            ps=conexion.prepareStatement("select * from productos where id="+cod);
            rs=ps.executeQuery();
            
            if(rs.next()) {
                System.out.println("Codigo: "+rs.getInt("id")+"\nProducto: "+rs.getString("producto")+"\nStock: "+rs.getString("stock")+"\nPrecio unitario: "+rs.getInt("precio_unitario")+"\n");
                
                input.nextLine();
                System.out.println("Ingrese el nuevo producto: ");
                producto=input.nextLine();
                System.out.println("Ingrese el nuevo stock: ");
                stock=input.nextInt();
                System.out.println("Ingrese la nueva precio unitario: ");
                precio_unitario=input.nextInt();
                
                ps=conexion.prepareStatement("update productos set producto=?, stock=?, precio_unitario=? where id=?");
                ps.setString(1, producto);
                ps.setInt(2, stock);
                ps.setInt(3, precio_unitario);
                ps.setInt(4, cod);
                resultado=ps.executeUpdate();
                
            } else {
                System.out.println("no existe el registro");
            }
            conexion.close();
        } catch (Exception ex) {
            System.out.println("error: "+ex);
        }
    }
}
