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
public class Ejercicio11 {
    
    static final double DESCUENTO_ESPECIAL = 0.10;

    
    public static void calcularDescuentoEspecial(double precio) {
        double descuento = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuento;

        System.out.println("Descuento especial aplicado: " + descuento);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}

