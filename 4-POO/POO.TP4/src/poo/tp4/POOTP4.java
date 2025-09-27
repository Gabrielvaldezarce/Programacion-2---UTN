/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.tp4;

/**
 *
 * @author gabriel
 */
public class POOTP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1 = new Empleado(1001, "Ana Gomez", "Desarrolladora", 300000.0);
        Empleado e2 = new Empleado("Luis Perez", "Tester");
        Empleado e3 = new Empleado("Maria Ruiz", "Soporte");

        e1.actualizarSalario(10.0);
        e2.actualizarSalario(150000);
        e3.setSalario(200000.0);
        e3.actualizarSalario(5.0);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}