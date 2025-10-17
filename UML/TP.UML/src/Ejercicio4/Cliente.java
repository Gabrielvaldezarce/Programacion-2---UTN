/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author gabriel
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetadeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetadeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public TarjetadeCredito getTarjeta() { return tarjeta; }
}