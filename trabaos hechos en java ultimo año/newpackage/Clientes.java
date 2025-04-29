package newpackage;

import java.util.Scanner;

public class Clientes {
    Scanner datos = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private String direccion;
    private float totalPagar;
    private float gastoEnvio = 0;

    public Clientes(String nombre, String apellido, String direccion, float totalPagar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.totalPagar = totalPagar;
    }
    
    public int opciones() {
        System.out.println("1.ingresar datos de Capital Federal \n2.ingresar datos de avellaneda \n3.ingresar datos de Lanus \n4.ingresar datos de Quilmes \n5.salir");
        int opcion = datos.nextInt();
        return opcion;
    }

    public void setGastoEnvio(int gastoEnvio) {
        this.gastoEnvio = gastoEnvio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public float getGastoEnvio() {
        return gastoEnvio;
    }
    
    public void gastoDeEnvio() {
        System.out.println("el gasto de envio es: " + gastoEnvio);
    }
    
    public int cantidadClientes() {
        String localidad = "a";
        System.out.println("ingrese la cantidad de clientes de "+localidad+": ");
        int cantidad = datos.nextInt();
        return cantidad;
    }
    
    public void mostrarDatos() {
        System.out.println("nombre: "+nombre+"\napellido: "+apellido+"\ndireccion: "+direccion+"\ntotal a pagar: "+(totalPagar+gastoEnvio));
    }
    
    public void ventaPorLocalidad() {
        System.out.println("el total vendido por la localidad es: "+(totalPagar));
    }
    
}
