package algebra;

public class Main {
    public static void main(String[] args) {
        int opcion, opcion2;
        
        Algebra op2 = new Algebra(1,1,1);
        Algebra op1 = new Algebra(1,1,1);
        Algebra perimetro = new Algebra(1,1,1);
        Algebra superficie = new Algebra(1,1,1);
        
        opcion2 = op2.opcion2();
        
        if(opcion2 == 2) {
            do {
                opcion = op1.opcion();
                switch(opcion) {
                case 1: 
                    perimetro.perimetroCuadrado();
                    break;
                case 2:
                    perimetro.perimetroRectangulo();
                    break;
                case 3:
                    perimetro.perimetroTrianguloEquilatero();
                    break;
                case 4: 
                    perimetro.perimetroTrianguloIsoseles();
                    break;
                case 5:
                    perimetro.perimetroTrianguloEscaleno();
                    break;
                case 6:
                    break;
                default: System.out.println("opcion no existente");
                }
            }while(opcion != 6);
        } else {
            if(opcion2 == 1) {
                do {
                    opcion = op1.opcion();
                    switch(opcion) {
                    case 1: 
                        superficie.superficieCuadrado();
                        break;
                    case 2:
                        superficie.superficieRectangulo();
                        break;
                    case 3:
                        superficie.superficie3Triangulo();
                        break;
                    case 4: 
                        superficie.superficie3Triangulo();
                        break;
                    case 5:
                        superficie.superficie3Triangulo();
                        break;
                    case 6:
                        break;
                    default: System.out.println("opcion no existente");
                    }
                }while(opcion != 6);
            }
        }
    }
}
