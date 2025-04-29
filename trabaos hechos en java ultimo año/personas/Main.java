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
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        ArrayList<Persona> persona = new ArrayList<Persona>();
        
        int opcion, contador=0;
        char continuar, opcion1;
        String materia;
        float nota=0;
        
        do {
            
        System.out.println("\n1) cargar datos \n2) mostrar datos \n3) mostrar los profesores que den una materia especifica \n4) los alumnos desaprovados \n5) la cantidad de alumnos que son de avellaneda con su promedio de notas \n6) salir");
        System.out.println("\nelejir una opcion: ");
        opcion = datos.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("1) ingresar datos de alumnos \n2) ingresar datos de profesores \n3) volver");
                int opcion2 = datos.nextInt();
                if(opcion2 == 1) {
                    do {
                        Alumno alumno = new Alumno();
                        alumno.ingresarDatos();
                        persona.add(alumno);
                        System.out.println("quiere seguir cargando? S/N: ");
                        continuar = datos.next().charAt(0);
                    }while(continuar == 's' || continuar == 'S');
                } else {
                    if(opcion2 == 2) {
                        do {
                            Profesor profesor = new Profesor();
                            profesor.ingresarDatos();
                            persona.add(profesor);
                            System.out.println("quiere seguir cargando? S/N: ");
                            continuar = datos.next().charAt(0);
                        }while(continuar == 's' || continuar == 'S');
                    }
                }
                
                break;
            case 2:
                System.out.println("1) cargar datos de alumnos \n2) cargar datos de profesores \n3) volver");
                int opcion3 = datos.nextInt();
                if(opcion3 == 1) {
                    for(Persona personas: persona) {
                        if(personas.getCarga() == 2) {
                            personas.mostrarDatos();
                        }
                    }
                } else {
                    if(opcion3 == 2) {
                        for(Persona personas: persona) {
                            if(personas.getCarga() == 1) {
                                personas.mostrarDatos();
                            }
                        }
                    }
                } 
                break;
            case 3:
                System.out.println("ingrese materia que quiere buscar: ");
                materia = datos.next();
                for(Persona personas: persona) {
                    if(personas.getMateria().equals(materia)) {
                        System.out.println("el profesor/a: "+personas.getNombre()+" "+personas.getApellido()+" da la materia buscada: "+personas.getMateria());
                    }
                }
                break;
            case 4:
                for(Persona personas: persona) {
                    if(personas.getNota() < 7) {
                        System.out.println("el alumno: "+personas.getNombre()+" "+personas.getApellido()+" desaprobo con una nota de: "+personas.getNota());
                    }
                }
                break;
            case 5:
                for(Persona personas: persona) {
                    if(personas.getLocalidad().equals("avellaneda") || personas.getLocalidad().equals("Avellaneda")) {
                        nota += personas.getNota();
                        contador++;
                    }
                }
                float promedio = nota/contador;
                    System.out.println("la cantidad de alumnos que son de Avellaneda son: "+contador+"\nel promedio de notas de alumnos que son de Avellaneda es: "+promedio);
                    contador=0;
                    nota=0;
                break;
            case 6:
                break;
            default:
                System.out.println("error");
        }
        
        }while(opcion != 6);
    }
}
