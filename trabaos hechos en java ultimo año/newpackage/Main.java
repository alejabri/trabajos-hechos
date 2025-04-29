package newpackage;

//import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nombre = null, apellido = null, direccion = null;
        float totalPagar = 0;
        
        //ArrayList<Clientes> cliente = new ArrayList<Clientes>();
        
        Quilmes gente = new Quilmes("alejandro","a","s",100f);
        Lanus gente1 = new Lanus("alejandro","a","s",1f);
        Avellaneda gente2 = new Avellaneda("alejandro","a","s",1f);
        CapFederal gente3 = new CapFederal("alejandro","a","s",1f);
        
        Clientes dato1 = new Clientes("","","",1f);
        
        int opcion1 = dato1.opciones();
        
        switch(opcion1) {
            case 1: 
                int cantidad = dato1.cantidadClientes();
                
                for(int i=0; i<cantidad; i++) {
                    CapFederal gentei = new CapFederal(nombre,apellido,direccion,totalPagar);
                }
                break;
        }
        /*gente.gastoDeEnvio();
        gente1.gastoDeEnvio();
        gente2.gastoDeEnvio();
        gente3.gastoDeEnvio();
        
        gente.cantidadClientes();
        gente1.cantidadClientes();
        gente2.cantidadClientes();
        gente3.cantidadClientes();*/
        
        gente.ventaPorLocalidad();
        
    }
}
