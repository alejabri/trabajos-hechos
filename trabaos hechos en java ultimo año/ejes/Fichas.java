package ejes;

import java.util.Scanner;

public class Fichas {
    Scanner guardar = new Scanner (System.in);
    private int X;
    private int Y;
    
    public void ingresarDatos() {
        do {
            System.out.println("ingrese el valor de X: ");
            X=guardar.nextInt();
            System.out.println("ingrese el valor de Y: ");
            Y=guardar.nextInt();
            
            if(X > 10 || X < -10 || Y > 10 || Y < -10) {
                System.out.println("sobre pasa el limite");
            }
        }while(X > 10 || X < -10 || Y > 10 || Y < -10);
    }

    public void setX(int X) {
        this.X = X;
    }
    
    public void setY(int Y) {
        this.Y = Y;
    }
    
    public int getX() {
        return X;
    }
    
    public int getY() {
        return Y;
    }
    
    public int elejirFicha() {
        System.out.println("que ficha desea mover? \n1.ficha1 \n2.ficha2");
        int opcion = guardar.nextInt();
        return opcion;
    }
    
    public int elejirMovimiento() {
        System.out.println("que movimiento quiere hacer? \n1.arriba \n2.derecha \n3.abajo \n4.izquierda \n5.volver \n6.salir");
        int opcion = guardar.nextInt();
        return opcion;
    }
    
    public void izquierdaX() {
        X--;
    }
    
    public void derechaX() {
        X++;
    }
    
    public void abajoY() {
        Y--;
    }
    
    public void arribaY() {
        Y++;
    }
    
    public void mostrarMovimientos1() {
        System.out.println("X= "+X+"\nY= "+Y);
    }

    /*public boolean equals(Object obj) {
        Fichas comparacion=(Fichas)obj;
        return this.getY().equals(comparacion.getY());
    }*/
   
}
