package crud;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Insertar {
    
    public void insert() {
        Scanner input = new Scanner (System.in);
        
        PreparedStatement ps;
        ResultSet rs;
        
        int edad, resultado, codigo;
        String nombre, apellido;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps = conexion.prepareStatement("select * from alumno");
            rs = ps.executeQuery();
            
            //if(rs.next()) {
                System.out.println("inserter los datos");
                //System.out.println("\ningrese el id: ");
                //codigo = input.nextInt();
                System.out.println("ingrese el nombre: ");
                nombre = input.next();
                System.out.println("ingrese el apellido: ");
                apellido = input.next();
                System.out.println("ingrese la edad: ");
                edad = input.nextInt();

                ps = conexion.prepareStatement("insert into alumno (id, nombre, apellido, edad)values(?,?,?,?)");
                ps.setString(1, "0");
                ps.setString(2, nombre);
                ps.setString(3, apellido);
                ps.setInt(4, edad);
                resultado=ps.executeUpdate();
                
                //ps = conexion.prepareStatement("select * from alumno where id="));
                //rs = ps.executeQuery();

                System.out.println("\ndatos subidos");

                //System.out.println("los datos ingresados son: ");
                //System.out.println("id: "+rs.getInt("id")+"\nnombre: "+rs.getString("nombre")+"\napellido: "+rs.getString("apellido")+"\nedad: "+rs.getInt("edad"));
                conexion.close();
            //}
            
            
        } catch (Exception ex) {
            System.out.println("error: "+ex);
        }
    }
}
