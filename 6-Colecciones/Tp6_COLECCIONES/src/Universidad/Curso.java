/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // bidireccional 1:N (muchos cursos tienen 1 profesor)

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    
    public void setProfesor(Profesor p) {
    
        if (this.profesor != null && this.profesor != p) {
            Profesor anterior = this.profesor;
            this.profesor = null;
            anterior.eliminarCurso(this);
        }
        this.profesor = p;
        if (p != null) {
            // asegurar que figure en la lista del profesor
            boolean yaEsta = false;
            for (Curso c : pCursos(p)) {
                if (c == this) { yaEsta = true; break; }
            }
            if (!yaEsta) {
                p.agregarCurso(this);
            }
        }
    }

    private java.util.ArrayList<Curso> pCursos(Profesor p) {

        return new java.util.ArrayList<>(); 
    }

    public void mostrarInfo() {
        String nomProf = (profesor == null) ? "sin profesor" : profesor.getNombre();
        System.out.println("Curso: " + codigo + " | " + nombre + " | Profesor: " + nomProf);
    }
}
