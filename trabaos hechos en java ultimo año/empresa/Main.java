package empresa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner guardar = new Scanner (System.in);
        
        ProductoFresco fresco1 = new ProductoFresco("mermelada", "30 de abril de 2024", 50, 300, "23 de mayo de 2023", "alemania");
        ProductoFresco fresco2 = new ProductoFresco("galletitas", "25 de mayo de 2024", 150, 500, "20 de mayo de 2023", "canada");
        ProductoRefrigerado refrigerado1 = new ProductoRefrigerado("yogur", "15 de diciembre de 2023", 500, 450, 123);
        ProductoRefrigerado refrigerado2 = new ProductoRefrigerado("queso", "15 de octubre de 2023", 520, 1200, 224);
        ProductoCongelado congelado1 = new ProductoCongelado("cerdo", "20 de mayo de 2025", 300, 2000, 18);
        ProductoCongelado congelado2 = new ProductoCongelado("vaca", "30 de mayo de 2025", 700, 3000, 18.5f);
        
        fresco1.mostrarProducto();
        System.out.println("");
        fresco2.mostrarProducto();
        System.out.println("");
        refrigerado1.mostrarProducto();
        System.out.println("");
        refrigerado2.mostrarProducto();
        System.out.println("");
        congelado1.mostrarProducto();
        System.out.println("");
        congelado2.mostrarProducto();
        System.out.println("");
        
        int opcion1;
        do {
            Producto opcion = new Producto("", "", 1, 1);
            opcion1 = opcion.confirmacion();
            
            if(opcion1 == 1) {
                int opcion2 = opcion.confirmacion2();
                int opcion3 = opcion.confirmacion3();
                
                switch(opcion2) {
                    case 1:
                        int opcionF = fresco1.pregunta();
                        
                        if(opcion3 == 1) {
                            
                            switch(opcionF) {
                                case 1:
                                    System.out.println("ingrese nuevo nombre: ");
                                    String nombre = guardar.nextLine();
                                    fresco1.setNombre(nombre);
                                    fresco1.mostrarProducto();
                                    break;
                                case 2:
                                    System.out.println("ingrese nueva fecha de vencimiento: ");
                                    String vencimiento = guardar.nextLine();
                                    fresco1.setVencimiento(vencimiento);
                                    fresco1.mostrarProducto();
                                    break;
                                case 3:
                                    System.out.println("ingrese nuevo numero de lote: ");
                                    int lote = guardar.nextInt();
                                    fresco1.setLote(lote);
                                    fresco1.mostrarProducto();
                                    break;
                                case 4:
                                    System.out.println("ingrese nuevo precio: ");
                                    int precio = guardar.nextInt();
                                    fresco1.setPrecio(precio);
                                    fresco1.mostrarProducto();
                                    break;
                                case 5:
                                    System.out.println("ingrese nueva fecha de envase: ");
                                    String envasado = guardar.nextLine();
                                    fresco1.setEnvasado(envasado);
                                    fresco1.mostrarProducto();
                                    break;
                                case 6:
                                    System.out.println("ingrese nuevo pais de origen: ");
                                    String paisOrigen = guardar.nextLine();
                                    fresco1.setPaisOrigen(paisOrigen);
                                    fresco1.mostrarProducto();
                                    break;
                                default:
                                    System.out.println("opcion no existente");
                                    break;
                            }
                        } else {
                            switch(opcionF) {
                                case 1:
                                    System.out.println("ingrese nuevo nombre: ");
                                    String nombre = guardar.nextLine();
                                    fresco2.setNombre(nombre);
                                    fresco2.mostrarProducto();
                                    break;
                                case 2:
                                    System.out.println("ingrese nueva fecha de vencimiento: ");
                                    String vencimiento = guardar.nextLine();
                                    fresco2.setVencimiento(vencimiento);
                                    fresco2.mostrarProducto();
                                    break;
                                case 3:
                                    System.out.println("ingrese nuevo numero de lote: ");
                                    int lote = guardar.nextInt();
                                    fresco2.setLote(lote);
                                    fresco2.mostrarProducto();
                                    break;
                                case 4:
                                    System.out.println("ingrese nuevo precio: ");
                                    int precio = guardar.nextInt();
                                    fresco2.setPrecio(precio);
                                    fresco2.mostrarProducto();
                                    break;
                                case 5:
                                    System.out.println("ingrese nueva fecha de envase: ");
                                    String envasado = guardar.nextLine();
                                    fresco2.setEnvasado(envasado);
                                    fresco2.mostrarProducto();
                                    break;
                                case 6:
                                    System.out.println("ingrese nuevo pais de origen: ");
                                    String paisOrigen = guardar.nextLine();
                                    fresco2.setPaisOrigen(paisOrigen);
                                    fresco2.mostrarProducto();
                                    break;
                                default:
                                    System.out.println("opcion no existente");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        int opcionR = refrigerado1.pregunta();
                        
                        if(opcion3 == 1) {
                            
                            switch(opcionR) {
                                case 1:
                                    System.out.println("ingrese nuevo nombre: ");
                                    String nombre = guardar.nextLine();
                                    refrigerado1.setNombre(nombre);
                                    refrigerado1.mostrarProducto();
                                    break;
                                case 2:
                                    System.out.println("ingrese nueva fecha de vencimiento: ");
                                    String vencimiento = guardar.nextLine();
                                    refrigerado1.setVencimiento(vencimiento);
                                    refrigerado1.mostrarProducto();
                                    break;
                                case 3:
                                    System.out.println("ingrese nuevo numero de lote: ");
                                    int lote = guardar.nextInt();
                                    refrigerado1.setLote(lote);
                                    refrigerado1.mostrarProducto();
                                    break;
                                case 4:
                                    System.out.println("ingrese nuevo precio: ");
                                    int precio = guardar.nextInt();
                                    refrigerado1.setPrecio(precio);
                                    refrigerado1.mostrarProducto();
                                    break;
                                case 5:
                                    System.out.println("ingrese nuevo codigo SENASA: ");
                                    int SENASA = guardar.nextInt();
                                    refrigerado1.setSENASA(SENASA);
                                    refrigerado1.mostrarProducto();
                                    break;
                                default:
                                    System.out.println("opcion no existente");
                                    break;
                            }
                        } else {
                            switch(opcionR) {
                                case 1:
                                    System.out.println("ingrese nuevo nombre: ");
                                    String nombre = guardar.nextLine();
                                    refrigerado2.setNombre(nombre);
                                    refrigerado2.mostrarProducto();
                                    break;
                                case 2:
                                    System.out.println("ingrese nueva fecha de vencimiento: ");
                                    String vencimiento = guardar.nextLine();
                                    refrigerado2.setVencimiento(vencimiento);
                                    refrigerado2.mostrarProducto();
                                    break;
                                case 3:
                                    System.out.println("ingrese nuevo numero de lote: ");
                                    int lote = guardar.nextInt();
                                    refrigerado2.setLote(lote);
                                    refrigerado2.mostrarProducto();
                                    break;
                                case 4:
                                    System.out.println("ingrese nuevo precio: ");
                                    int precio = guardar.nextInt();
                                    refrigerado2.setPrecio(precio);
                                    refrigerado2.mostrarProducto();
                                    break;
                                case 5:
                                    System.out.println("ingrese nuevo codigo SENASA: ");
                                    int SENASA = guardar.nextInt();
                                    refrigerado2.setSENASA(SENASA);
                                    refrigerado2.mostrarProducto();
                                    break;
                                default:
                                    System.out.println("opcion no existente");
                                    break;
                            }
                        }
                        break;
                    case 3:
                        int opcionC = congelado1.pregunta();
                        if(opcion3 == 1) {
                            
                            switch(opcionC) {
                                case 1:
                                    System.out.println("ingrese nuevo nombre: ");
                                    String nombre = guardar.nextLine();
                                    congelado1.setNombre(nombre);
                                    congelado1.mostrarProducto();
                                    break;
                                case 2:
                                    System.out.println("ingrese nueva fecha de vencimiento: ");
                                    String vencimiento = guardar.nextLine();
                                    congelado1.setVencimiento(vencimiento);
                                    congelado1.mostrarProducto();
                                    break;
                                case 3:
                                    System.out.println("ingrese nuevo numero de lote: ");
                                    int lote = guardar.nextInt();
                                    congelado1.setLote(lote);
                                    congelado1.mostrarProducto();
                                    break;
                                case 4:
                                    System.out.println("ingrese nuevo precio: ");
                                    int precio = guardar.nextInt();
                                    congelado1.setPrecio(precio);
                                    congelado1.mostrarProducto();
                                    break;
                                case 5:
                                    System.out.println("ingrese nueva temperatura de congelacion: ");
                                    float temperatura = guardar.nextFloat();
                                    congelado1.setTemperatura(temperatura);
                                    congelado1.mostrarProducto();
                                    break;
                                default:
                                    System.out.println("opcion no existente");
                                    break;
                            }
                        } else {
                            switch(opcionC) {
                                case 1:
                                    System.out.println("ingrese nuevo nombre: ");
                                    String nombre = guardar.nextLine();
                                    congelado2.setNombre(nombre);
                                    congelado2.mostrarProducto();
                                    break;
                                case 2:
                                    System.out.println("ingrese nueva fecha de vencimiento: ");
                                    String vencimiento = guardar.nextLine();
                                    congelado2.setVencimiento(vencimiento);
                                    congelado2.mostrarProducto();
                                    break;
                                case 3:
                                    System.out.println("ingrese nuevo numero de lote: ");
                                    int lote = guardar.nextInt();
                                    congelado2.setLote(lote);
                                    congelado2.mostrarProducto();
                                    break;
                                case 4:
                                    System.out.println("ingrese nuevo precio: ");
                                    int precio = guardar.nextInt();
                                    congelado2.setPrecio(precio);
                                    congelado2.mostrarProducto();
                                    break;
                                case 5:
                                    System.out.println("ingrese nueva temperatura de congelacion: ");
                                    float temperatura = guardar.nextFloat();
                                    congelado2.setTemperatura(temperatura);
                                    congelado2.mostrarProducto();
                                    break;
                                default:
                                    System.out.println("opcion no existente");
                                    break;
                            }
                        }
                        break;
                    default:
                        System.out.println("opcion no existente");
                        break;
                }
            }
        }while(opcion1 != 2);
        
        if(fresco1.getPrecio() > fresco2.getPrecio() && fresco1.getPrecio() > refrigerado1.getPrecio() && fresco1.getPrecio() > refrigerado2.getPrecio() &&  fresco1.getPrecio() > congelado1.getPrecio() && fresco1.getPrecio() > congelado2.getPrecio()) {
            System.out.println(fresco1.getNombre()+" es el producto mas caro costando "+fresco1.getPrecio()+" pesos");
        } else {
            if(fresco2.getPrecio() > fresco1.getPrecio() && fresco2.getPrecio() > refrigerado1.getPrecio() && fresco2.getPrecio() > refrigerado2.getPrecio() &&  fresco2.getPrecio() > congelado1.getPrecio() && fresco2.getPrecio() > congelado2.getPrecio()) {
                System.out.println(fresco2.getNombre()+" es el producto mas caro costando "+fresco2.getPrecio()+" pesos");
            } else {
                if(refrigerado2.getPrecio() > fresco1.getPrecio() && refrigerado2.getPrecio() > fresco2.getPrecio() && refrigerado2.getPrecio() > refrigerado1.getPrecio() &&  refrigerado2.getPrecio() > congelado1.getPrecio() && refrigerado2.getPrecio() > congelado2.getPrecio()) {
                    System.out.println(refrigerado1.getNombre()+" es el producto mas caro costando "+refrigerado1.getPrecio()+" pesos");
                    } else {
                        if(refrigerado1.getPrecio() > fresco1.getPrecio() && refrigerado1.getPrecio() > fresco2.getPrecio() && refrigerado1.getPrecio() > refrigerado2.getPrecio() &&  refrigerado1.getPrecio() > congelado1.getPrecio() && refrigerado1.getPrecio() > congelado2.getPrecio()) {
                            System.out.println(refrigerado2.getNombre()+" es el producto mas caro costando "+refrigerado2.getPrecio()+" pesos");
                        } else {
                            if(congelado1.getPrecio() > fresco1.getPrecio() && congelado1.getPrecio() > fresco2.getPrecio() && congelado1.getPrecio() > refrigerado1.getPrecio() &&  congelado1.getPrecio() > refrigerado2.getPrecio() && congelado1.getPrecio() > congelado2.getPrecio()) {
                                System.out.println(congelado1.getNombre()+" es el producto mas caro costando "+congelado1.getPrecio()+" pesos");
                            } else {
                                if(congelado2.getPrecio() > fresco1.getPrecio() && congelado2.getPrecio() > fresco2.getPrecio() && congelado2.getPrecio() > refrigerado1.getPrecio() &&  congelado2.getPrecio() > refrigerado2.getPrecio() && congelado2.getPrecio() > congelado1.getPrecio()) {
                                    System.out.println(congelado2.getNombre()+" es el producto mas caro costando "+congelado2.getPrecio()+" pesos");
                                }
                            }
                        }
                    }
                }
            }
        
        float suma = fresco1.getPrecio() + fresco2.getPrecio() + refrigerado1.getPrecio() + refrigerado2.getPrecio() + congelado1.getPrecio() + congelado2.getPrecio();
        float promedio = suma/6;
        System.out.println("el precio promedio de todos los productos es: "+promedio);
    }
}
