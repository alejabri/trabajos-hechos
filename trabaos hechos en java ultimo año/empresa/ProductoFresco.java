package empresa;

import java.util.Scanner;

public class ProductoFresco extends Producto {
    Scanner guardar = new Scanner (System.in);
    
    private String envasado;
    private String paisOrigen;

    public ProductoFresco(String nombre, String vencimiento, int lote, float precio, String envasado, String paisOrigen) {
        super(nombre, vencimiento, lote, precio);
        this.envasado = envasado;
        this.paisOrigen = paisOrigen;
    }
    
    public void mostrarProducto() {
        System.out.println("nombre: "+getNombre()+"\nfecha de vencimiento: "+getVencimiento()+"\nnumero de lote: "+getLote()+"\nprecio: "+getPrecio()+" pesos \nfecha de envase: "+envasado+"\npais de origen: "+paisOrigen);
    }
    
    public int pregunta() {
        System.out.println("que desea cambiar: \n1.nombre \n2.fecha de vencimiento \n3.numero de lote \n4.precio \n5.fecha de envase \n6.pais de origen");
        int opcion = guardar.nextInt(); 
        return opcion;
    }

    public void setEnvasado(String envasado) {
        this.envasado = envasado;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
}
