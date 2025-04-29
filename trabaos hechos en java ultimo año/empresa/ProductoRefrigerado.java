package empresa;

import java.util.Scanner;

public class ProductoRefrigerado extends Producto {
    Scanner guardar = new Scanner (System.in);
    private int SENASA;

    public ProductoRefrigerado(String nombre, String vencimiento, int lote, float precio, int SENASA) {
        super(nombre, vencimiento, lote, precio);
        this.SENASA = SENASA;
    }
    
    public void mostrarProducto() {
        System.out.println("nombre: "+getNombre()+"\nfecha de vencimiento: "+getVencimiento()+"\nnumero de lote: "+getLote()+"\nprecio: "+getPrecio()+" pesos \ncodigo del SENASA: "+SENASA);
    }
    
    public int pregunta() {
        System.out.println("que desea cambiar: \n1.nombre \n2.fecha de vencimiento \n3.numero de lote \n4.precio \n5.codigo SENASA");
        int opcion = guardar.nextInt(); 
        return opcion;
    }

    public void setSENASA(int SENASA) {
        this.SENASA = SENASA;
    }
}
