package crud;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Modificar {
    
    public void mod() {
        Scanner input = new Scanner (System.in);
        
        PreparedStatement ps;
        ResultSet rs;
        
        int cod, edad, resultado;
        String nombre, apellido;
        
        try {
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            System.out.println("ingrese el código del alumno a modificar: ");
            cod=input.nextInt();
            
            ps=conexion.prepareStatement("select * from alumno where id="+cod);
            rs=ps.executeQuery();
            
            if(rs.next()) {
                System.out.println("Codigo: "+rs.getInt("id")+"\nNombre: "+rs.getString("nombre")+"\nApellido: "+rs.getString("apellido")+"\nEdad: "+rs.getInt("edad")+"\n");
                
                input.nextLine();
                System.out.println("Ingrese el nuevo nombre");
                nombre=input.nextLine();
                System.out.println("Ingrese el nuevo apellido");
                apellido=input.nextLine();
                System.out.println("Ingrese la nueva edad");
                edad=input.nextInt();
                
                ps=conexion.prepareStatement("update alumno set nombre=?, apellido=?, edad=? where id=?");
                ps.setString(1, nombre);
                ps.setString(2, apellido);
                ps.setInt(3, edad);
                ps.setInt(4, cod);
                resultado=ps.executeUpdate();

                //System.out.println("\n nuevos datos cambiados: ");
                //System.out.println("\nCodigo: "+rs.getInt("id")+"\n Nombre: "+rs.getString("nombre")+"\n Apellido: "+rs.getString("apellido")+"\n Edad: "+rs.getInt("edad")+"\n");

            } else {
                System.out.println("no existe el registro");
            }
            conexion.close();
        } catch (Exception ex) {
            System.out.println("error: "+ex);
        }
    }
}
