/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    // usar setProfesor del curso para mantener bidireccionalidad
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c != null && p != null) {
            c.setProfesor(p);
        }
    }

    public void listarProfesores() {
        System.out.println("\n-- Profesores en " + nombre + " --");
        for (Profesor p : profesores) {
            p.mostrarInfo();
            p.listarCursos();
        }
    }

    public void listarCursos() {
        System.out.println("\n-- Cursos en " + nombre + " --");
        for (Curso c : cursos) {
            c.mostrarInfo();
        }
    }

    // eliminar curso: romper relacion con profesor si existe
    public void eliminarCurso(String codigo) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo().equals(codigo)) {
                Curso c = cursos.get(i);
                if (c.getProfesor() != null) {
                    c.setProfesor(null); // quita del profesor
                }
                cursos.remove(i);
                break;
            }
        }
    }

    // eliminar profesor: dejar profesor = null en todos sus cursos
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) return;
        for (Curso c : cursos) {
            if (c.getProfesor() == p) {
                c.setProfesor(null);
            }
        }
        // quitarlo de la lista de profesores
        for (int i = 0; i < profesores.size(); i++) {
            if (profesores.get(i) == p) {
                profesores.remove(i);
                break;
            }
        }
    }

    // reporte simple: cantidad de cursos por profesor
    public void reporteCursosPorProfesor() {
        System.out.println("\n-- Reporte: cantidad de cursos por profesor --");
        for (Profesor p : profesores) {
            int cuenta = 0;
            for (Curso c : cursos) {
                if (c.getProfesor() == p) cuenta++;
            }
            System.out.println(p.getNombre() + ": " + cuenta);
        }
    }
}
