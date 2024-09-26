package ejercicios;

import java.util.Scanner;

public class TiendaAlex {
    //arreglo 5x5;
    static Scanner sc = new Scanner(System.in);
   static String[] [] [] [] [] matrizProducto = new String[5][5][5][5][5]; //{{{{ {}, {}, {} }}}}
   static String[] producto = new String[5];
    static int idProducto;
    static String nombreProducto;
    static float precio;
    static int cantidad;
    static boolean estado;

    public static void main(String[] args) {
        System.out.println("Ingrese datos del producto");
         crearProductos();
        System.out.println(idProducto + ", " + nombreProducto + ", " + precio + ", " + cantidad + ", " + estado);
    }

    public static void crearProductos(){
        for(int i = 0; i < producto.length; i++) {
            idProducto = i;

            System.out.println("Ingrese nombre del producto");
            nombreProducto = sc.nextLine();

            System.out.println("Ingrese cantidad");
            cantidad = sc.nextInt();

            System.out.println("Ingrese precio");
            precio = sc.nextInt();

            estado = true;

        }
    }

}