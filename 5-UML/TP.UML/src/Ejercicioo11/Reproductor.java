/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicioo11;

/**
 *
 * @author gabriel
 */

public class Reproductor {
    public void reproducir(Cancion c) {
        System.out.println("Reproduciendo: " + c.getTitulo() + " - " + c.getArtista().getNombre());
    }
}