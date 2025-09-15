/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_poo;

/**
 *
 * @author gabriel
 */
public class NaveEspacial {
  String nombre;
    int combustible;
    final int CAPACIDAD_MAX = 100; // limite del tanque

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + CAPACIDAD_MAX);
    }

    public void despegar() {
        if (combustible > 0) {
            System.out.println("La nave despego!");
        } else {
            System.out.println("No hay combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        if (distancia <= combustible) {
            combustible -= distancia;
            System.out.println("La nave avanzo " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad invalida.");
            return;
        }
        int nuevo = combustible + cantidad;
        if (nuevo > CAPACIDAD_MAX) {
            combustible = CAPACIDAD_MAX;
            System.out.println("Tanque lleno al maximo (" + CAPACIDAD_MAX + ").");
        } else {
            combustible = nuevo;
            System.out.println("Recarga exitosa. Combustible actual: " + combustible);
        }
    }  
}
