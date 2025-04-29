package algebra;

import java.util.Scanner;

public class Algebra {
    Scanner guardar = new Scanner (System.in);
    int lado;
    int base;
    int escaleno;
    
    public Algebra(int lado, int base, int escaleno) {
        this.lado = lado;
        this.base = base;
        this.escaleno = escaleno;
    }
    
    public int opcion() {
        System.out.println("1).Cuadrado \n2).Rectangulo \n3).Triangulo equilatero \n4).Triangulo isoseles \n5).Triangulo escaleno \n6).salir");
        System.out.println("\nelija una opcion: ");
        int opcion = guardar.nextInt();
        return opcion;
    }
    
    public int opcion2() {
        System.out.println("1).calcular superficie \n2).calcular perimetro \n3).salir");
        System.out.println("\nelija una opcion: ");
        int opcion2 = guardar.nextInt();
        return opcion2;
    }
    
    public void perimetroCuadrado() {
        System.out.println("ingrese un lado del cuadrado: ");
        lado = guardar.nextInt();
        int perimetro = lado*4;
        System.out.println("el perimetro del cuadrado es: "+perimetro);
    }
    
    public void perimetroRectangulo() {
        System.out.println("ingrese un lado del rectangulo: ");
        lado = guardar.nextInt();
        System.out.println("ingrese la base del rectangulo: ");
        base = guardar.nextInt();
        lado = lado*2;
        base = base*2;
        int perimetro = lado + base;
        System.out.println("el perimetro del rectangulo es: "+perimetro);
    }
    
    public void perimetroTrianguloEquilatero() {
        System.out.println("ingrese un lado del triangulo equilatero: ");
        lado = guardar.nextInt();
        int perimetro = lado*3;
        System.out.println("el perimetro del triangulo equilatero es: "+perimetro);
    }
    
    public void perimetroTrianguloIsoseles() {
        System.out.println("ingrese un lado del triangulo isoseles: ");
        lado = guardar.nextInt();
        System.out.println("ingrese la base del triangulo isoseles: ");
        base = guardar.nextInt();
        lado = lado*2;
        int perimetro = lado + base;
        System.out.println("el perimetro del triangulo isoseles es: "+perimetro);
    }
    
    public void perimetroTrianguloEscaleno() {
        System.out.println("ingrese el lado a del triangulo escaleno: ");
        lado = guardar.nextInt();
        System.out.println("ingrese el lado b del triangulo escaleno: ");
        base = guardar.nextInt();
        System.out.println("ingrese el lado c del triangulo escaleno: ");
        escaleno = guardar.nextInt();
        int perimetro = lado + base + escaleno;
        System.out.println("el perimetro del triangulo escaleno es: "+perimetro);
    }
    
    public void superficieCuadrado() {
        System.out.println("ingrese un lado del cuadrado: ");
        lado = guardar.nextInt();
        int superficie = lado*lado;
        System.out.println("la superficie del cuadrado es: "+superficie);
    }
    
    public void superficieRectangulo() {
        System.out.println("ingrese un lado del rectangulo: ");
        lado = guardar.nextInt();
        System.out.println("ingrese la base del rectangulo: ");
        base = guardar.nextInt();
        int perimetro = lado * base;
        System.out.println("la superficie del rectangulo es: "+perimetro);
    }
    
    public void superficie3Triangulo() {
        System.out.println("ingrese la altula del rectangulo: ");
        lado = guardar.nextInt();
        System.out.println("ingrese la base del rectangulo: ");
        base = guardar.nextInt();
        int perimetro = (base * lado)/2;
        System.out.println("la superficie del triangulo escaleno es: "+perimetro);
    }
    
}
