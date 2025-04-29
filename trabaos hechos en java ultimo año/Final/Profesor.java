/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Final;
import java.util.Scanner;
/**
 *
 * @author estudiante
 */
public class Profesor extends Persona{
    int tipo = 1;
    String materia;
    Scanner input = new Scanner(System.in);
    @Override
    public void ingresarDatos(){
        System.out.println("ingrese el nombre: ");
        String nombre = input.nextLine();
        setNombre(nombre);
        System.out.println("ingrese el apellido: ");
        String apellido = input.nextLine();
        setApellido(apellido);
        System.out.println("ingrese el direccion: ");
        String direccion = input.nextLine();
        setDireccion(direccion);        
        System.out.println("ingrese la localidad: ");
        String localidad = input.nextLine();
        setLocalidad(localidad);  
        System.out.println("ingrese la materia: ");
        this.materia = input.nextLine();
    }
    @Override
    public void mostrarDatos(){
        System.out.println("nombre: ");
        System.out.println(getNombre());
        System.out.println("apellido: ");
        System.out.println(getApellido());
        System.out.println("direccion: ");
        System.out.println(getDireccion());
        System.out.println("localidad: ");
        System.out.println(getLocalidad());
        System.out.println("materia: ");
        System.out.println(materia);
    }
    @Override
    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public float getNota(){
        return 11;
    }
    public int getTipo(){
        return tipo;
    }
}
