package ar.edu.unlu.prog1.tp2.ej13;

import ar.edu.unlu.prog1.tp2.ej11.Vehiculo;

import java.util.ArrayList;

public class Vuelo {

    private  ArrayList<Persona> miembros_vuelo;

    public void agregar_miembro_vuelo(Persona persona) {
        this.miembros_vuelo.add(persona);
    }
}
