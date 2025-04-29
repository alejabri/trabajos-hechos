package crud;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int opcion;
        
        Leer leer = new Leer();
        Modificar modificar = new Modificar();
        Insertar insertar = new Insertar();
        Eliminar eliminar = new Eliminar();
        
        do {
            System.out.println("1).leer \n2).modificar \n3).insertar \n4).eliminar \n5).salir \nelija una opcion:");
            opcion = input.nextInt();
            
            switch(opcion) {
                case 1: 
                    leer.leerTable();
                    break;
                case 2: 
                    
                    modificar.mod();
                    break;
                case 3: 
                    insertar.insert();
                    break;
                case 4: 
                    eliminar.delet();
                    break;
                case 5: 
                    break;
                default:
                    System.out.println("opcion no existente");
            }
        }while(opcion != 5);
       
    }
}
