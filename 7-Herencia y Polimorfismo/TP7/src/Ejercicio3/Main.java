/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author gabriel
 */

public class Main {

    public static void main(String[] args) {

        //lista de empleados
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("jorge"));
        empleados.add(new EmpleadoTemporal("Luis"));
        empleados.add(new EmpleadoPlanta("gabriel"));
        empleados.add(new EmpleadoTemporal("julio"));

        for (Empleado e : empleados) {
            System.out.println("-------------------------");
            System.out.println("Empleado: " + e.getNombre());
            System.out.println("Sueldo: $" + e.calcularSueldo());

            //instanceof 
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Temporal");
            }
        }
    }
}