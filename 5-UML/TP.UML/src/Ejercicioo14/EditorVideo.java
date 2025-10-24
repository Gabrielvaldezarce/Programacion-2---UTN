/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicioo14;

/**
 *
 * @author gabriel
 */

public class EditorVideo {
    public Render exportar(Proyecto p, String formato) {
        return new Render(formato, p);
    }
}