package carreras;

public class Main {
    public static void main(String[] args) {
        Carreras corredor1 = new Carreras("juan","perez","argentina","100 metros llanos","10 minutos");
        Carreras corredor2 = new Carreras("martin","hernandez","brasil","100 metros llanos","11 minutos");
        Carreras corredor3 = new Carreras("maria","fernandez","italia","100 metros llanos","9 minutos");
        Carreras corredor4 = new Carreras("sofia","gomez","suiza","100 metros con obstaculos","13 minutos");
        Carreras corredor5 = new Carreras("mario","fulano","ecuador","100 metros con obstaculos","12 minutos");
        Carreras corredor6 = new Carreras("facundo","mengano","chile","100 metros con obstaculos","15 minutos");
        
        corredor3.mostrarDatos1();
        
        corredor5.mostrarDatos2();
    }
}
