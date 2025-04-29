package herencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner guarda = new Scanner(System.in);
        
        Estudiante estudiante1=new Estudiante("carlos","perez",39,123,8.8f);
        Estudiante estudiante2=new Estudiante("juan","hernandez",20,124,5.8f);
        Estudiante estudiante3=new Estudiante("maria","rosiro",25,125,7.6f);
        
        estudiante1.mostrarDatos();
        System.out.println("");
        estudiante2.mostrarDatos();
        System.out.println("");
        estudiante3.mostrarDatos();
        
        Estudiante pregunta = new Estudiante("carlos","perez",39,123,8.8f);
        int confirmacion = pregunta.cambiarNota();
        
        if(confirmacion == 1) {
            System.out.println("\ningrese el codigo del alumno: ");
            int codigo = guarda.nextInt();
            
            if(codigo == estudiante1.getCodigoEstudiante()) {
                System.out.println("ingrese la nueva nota: ");
                float nota = guarda.nextFloat();
                estudiante1.setNotaFinal(nota);
                estudiante1.mostrarDatos();
            
            } else {
                if(codigo == estudiante2.getCodigoEstudiante()) {
                    System.out.println("ingrese la nueva nota: ");
                    float nota = guarda.nextFloat();
                    estudiante2.setNotaFinal(nota);
                    estudiante2.mostrarDatos();
            
                } else {
                    if(codigo == estudiante3.getCodigoEstudiante()) {
                        System.out.println("ingrese la nueva nota: ");
                        float nota = guarda.nextFloat();
                        estudiante3.setNotaFinal(nota);
                        estudiante3.mostrarDatos();
                        
                    }
                }
            }
            
        }

    }
    
}
