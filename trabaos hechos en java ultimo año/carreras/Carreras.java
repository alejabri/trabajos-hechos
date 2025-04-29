package carreras;



public class Carreras {
    public String nombre;
    public String apellido;
    public String nacionalidad;
    public String categoria;
    public String tiempo;
    
    public Carreras(String nombre, String apellido, String nacionalidad, String categoria, String tiempo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.categoria = categoria;
        this.tiempo = tiempo;
    }
    
    public void mostrarDatos1() {
        System.out.println(nombre+" "+apellido+" de "+nacionalidad+" gano los "+categoria+" en "+tiempo);
    }
    
    public void mostrarDatos2() {
        System.out.println(nombre+" "+apellido+" de "+nacionalidad+" gano los "+categoria+" en "+tiempo);
    }
    
}
