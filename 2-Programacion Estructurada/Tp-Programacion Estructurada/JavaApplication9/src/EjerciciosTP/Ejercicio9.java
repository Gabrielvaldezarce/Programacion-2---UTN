/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTP;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Ejercicio9 {
     public static double calcularCostoEnvio(double peso, String zona) 
     {
        zona = zona.toLowerCase();
        if (zona.equals("nacional")) {
            return 5.0 * peso;
        } else if (zona.equals("internacional")) {
            return 10.0 * peso;
        } else {
            return -1; 
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = scan.nextDouble();

        System.out.print("Ingrese la zona (Nacional/Internacional): ");
        String zona = scan.next();

        double envio = calcularCostoEnvio(peso, zona);

        if (envio < 0) {
            System.out.println("Zona invalida.");
        } else {
            double total = calcularTotalCompra(precio, envio);

            System.out.println("El costo de envio es: " + envio);
            System.out.println("El total a pagar es: " + total);
        }
    }
}

