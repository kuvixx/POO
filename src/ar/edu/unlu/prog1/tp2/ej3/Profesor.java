package ar.edu.unlu.prog1.tp2.ej3;

import java.util.ArrayList;

public class Profesor {
    public String nombre_ape;

    private ArrayList<Diagramacion> clases_que_da = new ArrayList<Diagramacion>();

    public String getNombre_ape() {
        return nombre_ape;
    }

    public ArrayList<Diagramacion> getClases_que_da() {
        return clases_que_da;
    }
    public void agregar_Clase(Diagramacion clase){
        this.clases_que_da.add(clase);
    }
}
