/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro l = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(l);
    }

    public void listarLibros() {
        System.out.println("\n== Libros en " + nombre + " ==");
        for (Libro l : libros) {
            l.mostrarInfo();
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getIsbn().equals(isbn)) {
                libros.remove(i);
                break;
            }
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n== Libros del anio " + anio + " ==");
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                l.mostrarInfo();
            }
        }
    }

    public void mostrarAutoresDisponibles() {
        System.out.println("\n== Autores disponibles ==");
        ArrayList<String> idsMostrados = new ArrayList<>();
        for (Libro l : libros) {
            Autor a = l.getAutor();
            if (!idsMostrados.contains(a.getId())) {
                a.mostrarInfo();
                idsMostrados.add(a.getId());
            }
        }
    }
}
