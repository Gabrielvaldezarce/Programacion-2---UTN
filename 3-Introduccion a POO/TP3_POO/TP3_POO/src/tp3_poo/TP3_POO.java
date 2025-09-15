/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_poo;

/**
 *
 * @author gabriel
 */
public class TP3_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// ===== Estudiante =====
        Estudiante e1 = new Estudiante();
        e1.nombre = "Lucia";
        e1.apellido = "Perez";
        e1.curso = "Programacion II";
        e1.calificacion = 6;

        e1.mostrarInfo();
        e1.subirCalificacion(2);
        e1.mostrarInfo();
        e1.bajarCalificacion(1);
        e1.mostrarInfo();

        // ===== Mascota =====
        Mascota m1 = new Mascota();
        m1.nombre = "Luna";
        m1.especie = "Gato";
        m1.edad = 2;

        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
        
   // ===== Libro  =====
        Libro l1 = new Libro();
        l1.setTitulo("Introduccion a Java");
        l1.setAutor("UTN");

        // invalido
        l1.setAnioPublicacion(1300);   
        l1.mostrarInfo();

        // valido
        l1.setAnioPublicacion(2024);  
        l1.mostrarInfo();
        
        
        // ===== Ejercicio 4: Gallina =====
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 1;

        Gallina g2 = new Gallina();
        g2.idGallina = 2;
        g2.edad = 2;

        // Simular acciones
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.ponerHuevo();

    
        g1.mostrarEstado();
        g2.mostrarEstado();
        
        // ===== Ejercicio 5: Nave Espacial =====
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Pegaso";
        nave.combustible = 50;

        nave.mostrarEstado();
        nave.despegar();
        nave.avanzar(60);       
        nave.recargarCombustible(30); 
        nave.avanzar(60);      
        nave.mostrarEstado();

                
        
        
    }
}