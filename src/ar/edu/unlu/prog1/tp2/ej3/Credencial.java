package ar.edu.unlu.prog1.tp2.ej3;

import ar.edu.unlu.prog1.tp2.ej3.Alumno;

import java.util.ArrayList;

public class Credencial {

    private Alumno alumno;
    private ArrayList<Diagramacion> clases_que_toma = new ArrayList<Diagramacion>();

    private int clases_tomadas[] = {0,0,0,0,0,0,0,0};

    public void setAlumno(Alumno alumno) {

        alumno.setCredencial(this);
        this.alumno = alumno;
    }

    public void inscribir_a_clase(Diagramacion clase) {
        this.clases_que_toma.add(clase);
        clase.inscribir_alumno(alumno);
    }
    public void anotar_presente(Diagramacion clase) {
        int i = this.clases_que_toma.indexOf(clase);
        this.clases_tomadas[i] = this.clases_tomadas[i] ++;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public ArrayList<Diagramacion> getClases_que_toma() {
        return clases_que_toma;
    }

    public int[] getClases_tomadas() {
        return clases_tomadas;
    }
}
