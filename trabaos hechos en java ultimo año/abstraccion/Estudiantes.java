package abstraccion;



public class Estudiantes extends Persona {
    
    private String escuela;

    public Estudiantes(String escuela, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.escuela = escuela;
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println("nombre: "+getNombre()+"\napellido: "+getApellido()+"\nedad: "+getEdad()+"\nescuela: "+escuela);
    }
}
