/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_poo;

/**
 *
 * @author gabriel
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {
        System.out.println(nombre + " (" + especie + "), edad: " + edad);
    }

    public void cumplirAnios() {
        edad++;
    }
}

