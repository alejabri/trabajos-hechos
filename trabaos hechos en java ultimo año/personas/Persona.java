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

public abstract class Persona {
    Scanner datos = new Scanner (System.in);
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }
    
    public abstract void ingresarDatos();
    public abstract void mostrarDatos();
    public abstract int getCarga();
    public abstract String getMateria();
    public abstract float getNota();
}
