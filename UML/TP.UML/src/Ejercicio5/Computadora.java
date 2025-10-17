/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author gabriel
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private Placamadre placamadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPM, String chipsetPM, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placamadre = new Placamadre(modeloPM, chipsetPM);
        this.propietario = propietario;
        propietario.setComputadora(this);
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public Placamadre getPlacamadre() { return placamadre; }
    public Propietario getPropietario() { return propietario; }
}
