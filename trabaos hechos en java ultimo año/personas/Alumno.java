/*tengo la clase padre Persona con sus atributos privados nombre, apellido, direccion y localidad y 
como minimo el metodo abstracto ingresarDatos y el metodo abstracto mostrarDatos. tengo dos clases 
hijas Profesor que tiene el atributo materia y Alumno que tiene el atributo nota mi programa debe 
realizar lo siguiente:

1) cargar datos
2) mostrar datos
3) mostrar los profesores que den una materia especifica
4) los alumnos desaprovados 
5) la cantidad de alumnos que son de avellaneda con su promedio de notas
6) salir

en este programa el vector de la clase Persona debe ser dinamico */

package personas;

import java.util.Scanner;

public class Alumno extends Persona {
    Scanner datos = new Scanner (System.in);
    private float nota;
    private int carga = 2;

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }
    
    public int getCarga() {
        return carga;
    }

    @Override
    public void ingresarDatos() {
        System.out.println("ingrese su nombre: ");
        String nombre = datos.nextLine();
        setNombre(nombre);
        System.out.println("ingrese su apellido: ");
        String apellido = datos.nextLine();
        setApellido(apellido);
        System.out.println("ingrese su direccion: ");
        String direccion = datos.nextLine();
        setDireccion(direccion);
        System.out.println("ingrese su localidad: ");
        String localidad = datos.nextLine();
        setLocalidad(localidad);
        System.out.println("ingrese su nota: ");
        float nota = datos.nextFloat();
        setNota(nota);
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("nombre: "+getNombre()+"\napellido: "+getApellido()+"\ndireccion: "+getDireccion()+"\nlocalidad: "+getLocalidad()+"\nnota: "+getNota()+"\n");
    }
    
    @Override
    public String getMateria() {
        return " ";
    }
}
