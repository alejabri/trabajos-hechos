package herencia;

import java.util.Scanner;

public class Estudiante extends Persona {
    Scanner guardar = new Scanner(System.in);
    
private int codigoEstudiante;
private float notaFinal;

public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
    super(nombre,apellido,edad);
    this.codigoEstudiante = codigoEstudiante;
    this.notaFinal=notaFinal;
    }

public void mostrarDatos(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Apellido: "+getApellido()+"\nEdad: "+getEdad()+" \nCódigo Estudiante: "+codigoEstudiante+" \nNota Final: "+getNotaFinal());
    }

public int cambiarNota() {
    System.out.println("\ndesea cambiar la nota de algun alumno? \n1.si \n2.no");
    int confirmacion = guardar.nextInt();
    return confirmacion;
}

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }

    public float getNotaFinal() {
        return notaFinal;
    }
    




}

