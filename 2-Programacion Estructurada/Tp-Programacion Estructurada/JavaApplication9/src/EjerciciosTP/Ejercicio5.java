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
public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int suma = 0;
        int num;

        while (true) {
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = scan.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                suma += num;
            }
        }

        System.out.println("La suma de los números pares es: " + suma);
    }
}

