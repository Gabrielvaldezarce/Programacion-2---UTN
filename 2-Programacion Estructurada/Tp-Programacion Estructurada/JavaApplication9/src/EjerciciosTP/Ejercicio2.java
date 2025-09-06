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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = scan.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = scan.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int c = scan.nextInt();

        int mayor = a; 

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        System.out.println("El mayor es: " + mayor);
    }
}
    

