package empresa;

import java.util.Scanner;

public class Producto {
    Scanner guardar = new Scanner (System.in);
    
    private String nombre;
    private String vencimiento;
    private int lote;
    private float precio;

    public Producto(String nombre, String vencimiento, int lote, float precio) {
        this.nombre = nombre;
        this.vencimiento = vencimiento;
        this.lote = lote;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public int getLote() {
        return lote;
    }

    public float getPrecio() {
        return precio;
    }
    
    public int confirmacion() {
        System.out.println("\ndesea modificar algun producto: \n1.si \n2.no");
        int opcion1 = guardar.nextInt();
        return opcion1;
    }
    
    public int confirmacion2() {
        System.out.println("que producto desea modificar: \n1.producto fresco \n2.producto refrigerado \n3.producto congelado");
        int opcion2 = guardar.nextInt();
        return opcion2;
    }
    
    public int confirmacion3() {
        System.out.println("producto 1 o producto 2?");
        int opcion3 = guardar.nextInt();
        return opcion3;
    }
    
}
