/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad;


import universidad.Profesor;
import universidad.Curso;
import universidad.Universidad;


public class MainUniversidad {
    public static void main(String[] args) {
        Universidad utn = new Universidad("UTN");

        // 1) crear profesores
        Profesor pr1 = new Profesor("PR1", "Ana Perez", "Matematica");
        Profesor pr2 = new Profesor("PR2", "Luis Gomez", "Programacion");
        Profesor pr3 = new Profesor("PR3", "Laura Diaz", "Bases de Datos");

        // 2) crear cursos
        Curso c1 = new Curso("C101", "Algebra");
        Curso c2 = new Curso("C102", "Programacion 1");
        Curso c3 = new Curso("C103", "Programacion 2");
        Curso c4 = new Curso("C104", "Estadistica");
        Curso c5 = new Curso("C105", "Base de Datos");

        // agregar a la universidad
        utn.agregarProfesor(pr1);
        utn.agregarProfesor(pr2);
        utn.agregarProfesor(pr3);

        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        // 3) asignar profesores a cursos
        utn.asignarProfesorACurso("C101", "PR1");
        utn.asignarProfesorACurso("C104", "PR1");

        utn.asignarProfesorACurso("C102", "PR2");
        utn.asignarProfesorACurso("C103", "PR2");

        utn.asignarProfesorACurso("C105", "PR3");

        // 4) listar cursos y profesores
        utn.listarCursos();
        utn.listarProfesores();

        // 5) cambiar el profesor de un curso (sincroniza ambos lados)
        System.out.println("\n-- cambiar profesor de C103 a PR3 --");
        utn.asignarProfesorACurso("C103", "PR3");
        utn.listarCursos();
        utn.listarProfesores();

        // 6) remover un curso y confirmar que ya no aparece en la lista del profesor
        System.out.println("\n-- eliminar curso C104 --");
        utn.eliminarCurso("C104");
        utn.listarCursos();
        utn.listarProfesores();

        // 7) remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\n-- eliminar profesor PR2 --");
        utn.eliminarProfesor("PR2");
        utn.listarCursos();
        utn.listarProfesores();

        // 8) reporte: cantidad de cursos por profesor
        utn.reporteCursosPorProfesor();
    }
}
