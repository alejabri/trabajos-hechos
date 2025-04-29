package basededatos2;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insertar {
    
    public void insert() {
        Scanner input = new Scanner (System.in);
        
        PreparedStatement ps;
        ResultSet rs;
        
        int stock, resultado, precio_unitario;
        String producto;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("select * from productos");
            rs = ps.executeQuery();
            
                System.out.println("inserter los datos");
                System.out.println("ingrese el producto: ");
                producto = input.next();
                System.out.println("ingrese el stock: ");
                stock = input.nextInt();
                System.out.println("ingrese el precio por unidad: ");
                precio_unitario = input.nextInt();

                ps = conexion.prepareStatement("insert into productos (id, producto, stock, precio_unitario)values(?,?,?,?)");
                ps.setString(1, "0");
                ps.setString(2, producto);
                ps.setInt(3, stock);
                ps.setInt(4, precio_unitario);
                resultado=ps.executeUpdate();

                //System.out.println("\ndatos subidos");

                conexion.close();
              
        } catch (Exception ex) {
            System.out.println("error: "+ex);
        }
    }
}