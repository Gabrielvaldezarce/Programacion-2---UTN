/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        // 1) Biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca UTN");

        // 2) Autores
        Autor a1 = new Autor("A1", "J. K. Rowling", "Reino Unido");
        Autor a2 = new Autor("A2", "Gabriel Garcia Marquez", "Colombia");
        Autor a3 = new Autor("A3", "Julio Cortazar", "Argentina");

        // 3) Agregar 5 libros
        biblio.agregarLibro("ISBN-001", "Harry Potter y la Piedra Filosofal", 1997, a1);
        biblio.agregarLibro("ISBN-002", "Harry Potter y la Camara Secreta", 1998, a1);
        biblio.agregarLibro("ISBN-003", "Cien Anios de Soledad", 1967, a2);
        biblio.agregarLibro("ISBN-004", "El Amor en los Tiempos del Colera", 1985, a2);
        biblio.agregarLibro("ISBN-005", "Rayuela", 1963, a3);

        // 4) Listar todos los libros
        biblio.listarLibros();

        // 5) Buscar por ISBN
        System.out.println("\n-- Buscar libro ISBN-003 --");
        Libro buscado = biblio.buscarLibroPorIsbn("ISBN-003");
        if (buscado != null) buscado.mostrarInfo();

        // 6) Filtrar por año
        biblio.filtrarLibrosPorAnio(1998);

        // 7) Eliminar por ISBN y volver a listar
        System.out.println("\n-- Eliminar ISBN-004 --");
        biblio.eliminarLibro("ISBN-004");
        biblio.listarLibros();

        // 8) Cantidad total de libros
        System.out.println("\nCantidad total de libros: " + biblio.obtenerCantidadLibros());

        // 9) Listar autores disponibles (sin repetir)
        biblio.mostrarAutoresDisponibles();
    }
}
