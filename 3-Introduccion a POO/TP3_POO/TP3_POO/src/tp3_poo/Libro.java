/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_poo;

/**
 *
 * @author gabriel
 */
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }

    public void setAnioPublicacion(int anio) {
        if (anio >= 1450 && anio <= 2025) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("Anio invalido, sin cambios.");
        }
    }

    public void mostrarInfo() {
        System.out.println("Libro: " + titulo + " - " + autor + " (" + anioPublicacion + ")");
    }
}
