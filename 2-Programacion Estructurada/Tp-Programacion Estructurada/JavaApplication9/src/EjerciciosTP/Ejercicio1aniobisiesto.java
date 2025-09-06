/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosTP;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Ejercicio1aniobisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Ingrese un anio: ");
        int anio= scan.nextInt();
        
        boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        
        if (bisiesto) {
            System.out.println("El anio " + anio + " es bisiesto");
        }
        else {
            System.out.println("El anio " + anio + " no es bisiesto");
        }
    }
    
}
