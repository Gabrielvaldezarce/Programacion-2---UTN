/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_poo;

/**
 *
 * @author gabriel
 */
public class Estudiante {
    
    // Atributos
    String nombre;
    String apellido;
    String curso;
    int calificacion;

    public void mostrarInfo() {
        System.out.println(nombre + " " + apellido + " - Curso: " + curso + " - Nota: " + calificacion);
    }

    public void subirCalificacion(int puntos) {
        calificacion += puntos;
    }

    public void bajarCalificacion(int puntos) {
        calificacion -= puntos;
    }
}
