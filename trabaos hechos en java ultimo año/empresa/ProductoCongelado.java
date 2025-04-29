package empresa;

import java.util.Scanner;

public class ProductoCongelado extends Producto {
    Scanner guardar = new Scanner (System.in);
    private float temperatura;

    public ProductoCongelado(String nombre, String vencimiento, int lote, float precio, float temperatura) {
        super(nombre, vencimiento, lote, precio);
        this.temperatura = temperatura;
    }
    
    public void mostrarProducto() {
        System.out.println("nombre: "+getNombre()+"\nfecha de vencimiento: "+getVencimiento()+"\nnumero de lote: "+getLote()+"\nprecio: "+getPrecio()+" pesos \ntemperatura de congelacion recomendada: "+temperatura);
    }
    
    public int pregunta() {
        System.out.println("que desea cambiar: \n1.nombre \n2.fecha de vencimiento \n3.numero de lote \n4.precio \n5.temperatura de congelacion");
        int opcion = guardar.nextInt(); 
        return opcion;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
    
}
