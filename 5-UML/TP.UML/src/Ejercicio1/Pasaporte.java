/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author gabriel
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;        // composición
    private Titular titular;  // asociación

    public Pasaporte(String numero, String fechaEmision,
                     String imagenFoto, String formatoFoto,
                     Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagenFoto, formatoFoto); // se crea adentro (composición)
        this.titular = titular;
        titular.setPasaporte(this);                    // mantiene bidireccionalidad
    }
}
