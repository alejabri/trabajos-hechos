package Final;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
    ArrayList<Persona> persona = new ArrayList<Persona>();
    boolean sigue = false;
    boolean salir = false;
    int tipo;
    float notas =0;
    int cantNotas =0;
    Scanner input = new Scanner(System.in);
        do {
            
        System.out.println("1. cargar datos \n2. mostrar datos \n3. mostrar los profesores (que den alguna materia especifica) \n4. mostrar los alumnos desaprobados \n5. mostrar la cantidad de alumnos que son de avelllaneda con su promedio de notas \n6. salir  \ningrese la opcion: ");
        int opcion = input.nextInt();
        switch(opcion){
            case 1:{
                Alumno alum = new Alumno();
                Profesor profe = new Profesor();
                System.out.println("\nQue quiere ingresar: \n1. alumno \n2. profesor");
                tipo = input.nextInt();
                do {
                sigue = false;
                switch (tipo){
                    case 1 :{
                        alum.ingresarDatos();
                        persona.add(alum);
                        sigue = true;                        
                    };break;
                    case 2 :{
                        profe.ingresarDatos(); 
                        persona.add(profe);
                        sigue = true;
                    };break;
                    default:{
                        System.out.println("ingrese una opcion valida");
                        sigue = false;
                    };break;
                } 
                }while (sigue == false);
            };break;
            case 2:{
                Alumno alum = new Alumno();
                Profesor profe = new Profesor();
                do {
                System.out.println("Que quiere mostrar: \n1. alumno \n2. profesor");
                tipo = input.nextInt();
                switch (tipo){
                    case 1 :{
                        for (Persona perso: persona) {
                            if (perso.getTipo() == 2) {
                                perso.mostrarDatos();
                                sigue = true;
                            }
                        }
                    };break;
                    case 2 :{
                        for (Persona perso: persona) {
                            if (perso.getTipo() == 1) {
                                perso.mostrarDatos();
                                sigue = true;
                            }
                        }
                    };break;
                    default:{
                        System.out.println("ingrese una opcion valida");
                        sigue = false;
                    };break;
                } 
                }while (sigue == false);
            };break;
            case 3:{
                System.out.println("ingrese la materia especifica:");
                String materiaIng = input.nextLine();
                materiaIng = input.nextLine();
                for (Persona perso: persona) {
                    String materia = perso.getMateria();
                    if (materia.equals(materiaIng)) {
                        System.out.println("profesor:\n nombre: "+perso.getNombre()+"\napellido: "+perso.getApellido());
                    }
                }
            };break;
            case 4:{
                for (Persona perso: persona) {
                    float nota = perso.getNota();
                    if (nota<7 ) {
                        System.out.println("alumno:\n nombre: "+perso.getNombre()+"\napellido: "+perso.getApellido());
                    }
                }
            };break;
            case 5:{
                for (Persona perso: persona) {
                    if (perso.getLocalidad().equals("avellaneda")) {
                        notas += perso.getNota();
                        cantNotas+=1;
                        System.out.println("alumno:\n nombre: "+perso.getNombre()+"\napellido: "+perso.getApellido());
                    }
                }
                System.out.println("la cantidad de alumnos de avellaneda es: "+cantNotas+"\n"
                        + "el promedio de notas es: "+(notas/cantNotas));
            };break;
            case 6:{
                salir = true;
            };break;
            default:{
                System.out.println("ingrese una opcion valida");
            };
        }
        } while (salir==false);
                
    }
    
}
