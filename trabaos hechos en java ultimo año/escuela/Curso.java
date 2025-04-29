package escuela;

import java.util.Scanner;

public class Curso {
    Scanner datos = new Scanner (System.in);
    public final String curso;
    public final int alumnos;
    int materias;

    public Curso(String curso, int alumnos, int materias) {
        this.curso = curso;
        this.alumnos = alumnos;
        this.materias = materias;
    }
    
    public int opciones() {
        System.out.println("1).mostrar los datos \n2).mostrar la cantidad de materias que tiene el curso con mayor cantidad de alumnos \n3).mostrar el proemdio de alumnos por curso \n4).salir");
        System.out.println("\nelija una opcion: ");
        int opcion = datos.nextInt();
        return opcion;
    }
    
    public void mostrarDatos() {
        System.out.println("nombre del curso: "+curso+"\ncantidad de alumnos: "+alumnos+"\ncantidad de materias: "+materias);
    }
    
}
