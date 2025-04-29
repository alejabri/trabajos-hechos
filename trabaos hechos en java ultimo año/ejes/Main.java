package ejes;



public class Main {
    public static void main(String[] args) {
        Fichas ficha1 = new Fichas();
        Fichas ficha2 = new Fichas();
        Fichas opciones = new Fichas();

        System.out.println("ficha 1");
        ficha1.ingresarDatos();
        
        int verificar = 0;
        do{
            System.out.println("ficha 2");
            ficha2.ingresarDatos();
            //if(ficha2.getX().equals(ficha1.getX()) && ficha2.getY().equals(ficha1.getY())) {
            if(ficha2.getX() == ficha1.getX() && ficha2.getY() == ficha1.getY()) {
                verificar = 1;
                System.out.println("no se puede implementar ya que esta la ficha 1");
            } else {
                verificar = 0;
            }
        }while(verificar == 1);    
        
        int opcion1 = opciones.elejirFicha();
        int opcion2;
        do {
        
            opcion2 = opciones.elejirMovimiento();
            
        if(opcion1 == 1) {
            switch(opcion2) {
                case 1:
                    //ficha1.getY()+1 == ficha2.getY() && ficha1.getX()+1 == ficha2.getX() || ficha1.getY()-1 == ficha2.getY() && ficha1.getX()-1 == ficha2.getX()
                    //if(ficha1.equals(ficha2)) {
                    if(ficha1.getX() == ficha2.getX() && ficha1.getY() == ficha2.getY()) {
                        ficha1.abajoY();
                        System.out.println("no se puede realizar el movimiento");
                    } else {
                        ficha1.arribaY();
                    }
                    break;
                case 2:
                    if(ficha1.getX() == ficha2.getX() && ficha1.getY() == ficha2.getY()) {
                        ficha1.izquierdaX();
                        System.out.println("no se puede realizar el movimiento");
                    } else {
                        ficha1.derechaX();
                    }
                    break;
                case 3:
                    if(ficha1.getX() == ficha2.getX() && ficha1.getY() == ficha2.getY()) {
                        ficha1.arribaY();
                        System.out.println("no se puede realizar el movimiento");
                    } else {
                        ficha1.abajoY();
                    }
                    break;
                case 4:
                    if(ficha1.getX() == ficha2.getX() && ficha1.getY() == ficha2.getY()) {
                        ficha1.derechaX();
                        System.out.println("no se puede realizar el movimiento");
                    } else {
                        ficha1.izquierdaX();
                    }
                    break;
                case 5:
                    opciones.elejirFicha();
                    break;
                case 6: 
                    break;
                default:
                    System.out.println("opcion no existente");
            }
            System.out.println("ficha 1 esta en:");
            ficha1.mostrarMovimientos1();
        } else {
            switch(opcion2) {
                case 1:
                    if(ficha1.getY() == ficha2.getY()) {
                        System.out.println("no se puede realizar el movimiento");
                    } else {
                        ficha2.arribaY();
                    }
                    break;
                case 2:
                    if(ficha1.getY() == ficha2.getY()) {
                        System.out.println("no se puede realizar el movimiento");
                    } else {
                        ficha2.derechaX();
                    }
                    break;
                case 3:
                    if(ficha1.getY() == ficha2.getY()) {
                        System.out.println("no se puede realizar el movimiento");
                    } else {
                        ficha2.abajoY();
                    }
                    break;
                case 4:
                    if(ficha1.getY() == ficha2.getY()) {
                        System.out.println("no se puede realizar el movimiento");
                        
                    } else {
                        ficha2.izquierdaX();
                    }
                    break;
                case 5:
                    opciones.elejirFicha();
                    break;
                case 6: 
                    break;
                default:
                    System.out.println("opcion no existente");
            }
            System.out.println("ficha 2 esta en:");
            ficha2.mostrarMovimientos1();
        }
        
        }while(opcion2 != 6);
        
    }
}
