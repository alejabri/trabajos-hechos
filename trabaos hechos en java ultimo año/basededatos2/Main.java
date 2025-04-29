/*
Realizar un programa para gestionar el stock de distintos artículos de un comercio,
me debe permir ingresar los artículos, modificarlos y realizar la venta de los mismos, 
para esto se ingresa el código del producto y la cantidad vendida el programa debe corroborar 
que haya stock y calcular el total a pagar. También me debe permitir cargar las compras, en este 
caso se ingresa el código y la cantidad comprada para que el programa actualice el stock y 
generar un listado de los productos que tienen un stock reducido.
 */

/*
ingresar, modificar y
ingresar codigo y cantidad, si hay stock se hace la cuenta se calcula el gasto y se modifica el stock de lo vendido
lo mismo con lo que se compra, se ingresa el id y la cantidad que se compro y se aumenta el stock 
*/
package basededatos2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        Leer tabla = new Leer();
        Insertar datos = new Insertar();
        Modificar modificar = new Modificar();
        Venta venta = new Venta();
        Compra compra = new Compra();
        Eliminar eliminar = new Eliminar();
        StockBajo minimo = new StockBajo();
        
        int opcion;
        
        do {
        
            tabla.leer();

            System.out.println("\n1.ingresar articulos \n2.modificar articulos \n3.realizar venta \n4.realizar compra\n5. productos con stock bajo\n6. eliminar\n7.salir");
            System.out.println("\nelegir una opcion: ");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    datos.insert();
                    break;
                case 2:
                    modificar.mod();
                    break;
                case 3:
                    venta.venta();
                    break;
                case 4:
                    compra.venta();
                    break;
                case 5:
                    minimo.stockMinimo();
                    break;
                case 6:
                    eliminar.delet();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("opcion no existente");
            }
        
        }while(opcion != 7);
        
    }
}
