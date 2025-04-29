package escuela;

public class Main {
    public static void main(String[] args) {
        Curso aula1 = new Curso("1°A",19,10);
        Curso aula2 = new Curso("2°B",20,11);
        Curso aula3 = new Curso("3°C",22,14);
        Curso aula4 = new Curso("4°D",18,13);
        
        Curso op = new Curso("a",1,1);
        int opcion;
        
        do { 
            opcion = op.opciones();
            switch(opcion) {
            case 1: 
                aula1.mostrarDatos();
                aula2.mostrarDatos();
                aula3.mostrarDatos();
                aula4.mostrarDatos();
                break;
            case 2:
                if(aula1.alumnos > aula2.alumnos && aula1.alumnos > aula3.alumnos &&  aula1.alumnos > aula4.alumnos) {
                    System.out.println("aula 1 tiene "+aula1.materias+" materias");
                } else {
                    if(aula2.alumnos > aula1.alumnos && aula2.alumnos > aula3.alumnos &&  aula2.alumnos > aula4.alumnos) {
                    System.out.println("aula 2 tiene "+aula2.materias+" materias");
                    } else {
                        if(aula3.alumnos > aula1.alumnos && aula3.alumnos > aula2.alumnos &&  aula3.alumnos > aula4.alumnos) {
                        System.out.println("aula 3 tiene "+aula3.materias+" materias");
                        } else {
                            if(aula4.alumnos > aula1.alumnos && aula4.alumnos > aula2.alumnos &&  aula4.alumnos > aula3.alumnos) {
                            System.out.println("aula 4 tiene "+aula4.materias+" materias");
                            }
                        }
                    }
                }
                break;
            case 3:
                int total = 0;
                total = aula1.alumnos + aula2.alumnos + aula3.alumnos + aula4.alumnos;
                total = total/4;
                System.out.println("el promedio de alumnos es: "+total);
                break;
            case 4:
                break;
            default: 
                System.out.println("opcion no existente");
        }
        }while(opcion != 4);
        
    }
}
