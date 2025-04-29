package newpackage;



public class CapFederal extends Clientes {
    
    static String localidad = "Capital";

    public CapFederal(String nombre, String apellido, String direccion, float totalPagar) {
        super(nombre, apellido, direccion, totalPagar);
    }
    
    @Override
     public void gastoDeEnvio() {
        System.out.println("el gasto de envio es: " + getGastoEnvio());
    }
     
    @Override
     public int cantidadClientes() {
        System.out.println("ingrese la cantidad de clientes de "+localidad+": ");
        int cantidad = datos.nextInt();
        return cantidad;
    }
     
    @Override
    public void mostrarDatos() {
       System.out.println("nombre: "+getNombre()+"\napellido: "+getApellido()+"\ndireccion: "+getDireccion()+"\ntotal a pagar: "+(getTotalPagar()+getGastoEnvio()));
    }
    
    @Override
    public void ventaPorLocalidad() {
        System.out.println("el total vendido por la localidad es: "+(getTotalPagar()));
    }
}
