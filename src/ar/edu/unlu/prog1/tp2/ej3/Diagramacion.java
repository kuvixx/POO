package ar.edu.unlu.prog1.tp2.ej3;

import ar.edu.unlu.prog1.tp2.ej2.Excursion;

import java.util.ArrayList;

public class Diagramacion {
    private  ArrayList<Alumno> alumnos_inscriptos = new ArrayList<Alumno>();
    private String dia;
    private String horario;
    private String nivel;
    private String disciplina;
    private String profesor;

    public ArrayList<Alumno> getAlumnos_inscriptos() {
        return alumnos_inscriptos;
    }

    public void inscribir_alumno(Alumno alumno) {
        this.alumnos_inscriptos.add(alumno);
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
}
