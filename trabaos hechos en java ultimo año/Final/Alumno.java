package Final;

/**
 *
 * @author estudiante
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno extends Persona{
    int tipo = 2;
    Scanner input = new Scanner(System.in);
    float nota;

    /**
     *
     * @return
     */
    @Override
    public int getTipo(){
        return tipo;
    }
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public String getMateria(){
        return "nada";
    }
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
        System.out.println("ingrese la nota: ");
        nota = input.nextInt();
        input.nextLine();
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
        System.out.println("nota: ");
        System.out.println(nota);
    }
}
