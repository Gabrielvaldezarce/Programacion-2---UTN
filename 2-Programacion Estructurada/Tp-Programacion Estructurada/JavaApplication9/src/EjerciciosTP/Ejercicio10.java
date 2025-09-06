/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTP;

import java.util.Scanner;

public class Ejercicio10 {

   
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el stock actual: ");
        int stockActual = scan.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int vendidos = scan.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int recibidos = scan.nextInt();

        int nuevoStock = actualizarStock(stockActual, vendidos, recibidos);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
}
