package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */

public class Main {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        Rectangulo r1 = new Rectangulo(5.0,  9.0, "Rectangulo 1");
        Rectangulo r2 = new Rectangulo(8.0,  7.0, "Rectangulo 2");
        Circulo c1 = new Circulo(12, "Circulo 1");
        Circulo c2 = new Circulo(10, "Circulo 2");
        
        figuras.add(r1);
        figuras.add(r2);
        figuras.add(c1);
        figuras.add(c2);
        
        for(Figura f : figuras){
            f.calcularArea();
        }
        
    }
    
}
