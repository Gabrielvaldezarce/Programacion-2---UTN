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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        System.out.print("Ingrese la categoria del producto (A, B o C): ");
        String categoria = scan.next().toUpperCase();

        double descuento = 0.0;

        switch (categoria) {
            case "A":
                descuento = 0.10; // 10%
                break;
            case "B":
                descuento = 0.15; // 15%
                break;
            case "C":
                descuento = 0.20; // 20%
                break;
            default:
                System.out.println("Categoria invalida");
                return;
        }

        double precioFinal = precio - (precio * descuento);

        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}

