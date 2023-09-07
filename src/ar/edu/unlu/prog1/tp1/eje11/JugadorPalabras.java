package ar.edu.unlu.prog1.tp1.eje11;

import ar.edu.unlu.prog1.tp1.eje11.Palabras;

import java.util.ArrayList;

public class JugadorPalabras {
    private final ArrayList<Palabras> listaPalabras = new ArrayList<Palabras>();
    private int puntosJugador = 0;

    public void agregarPalabra(String palabra){
        Palabras palabra1 = new Palabras();
        palabra1.setPalabra(palabra);
        this.puntosJugador = this.puntosJugador + palabra1.getPuntajePalabra();
        listaPalabras.add(palabra1);
    }

    public int getPuntosJugador() {
        return puntosJugador;
    }
    public String devolverPalabras(){
        String devolver = "";
        for (int i = 0; i <= listaPalabras.size(); i++){
            devolver = devolver + " , " + listaPalabras.get(i).getPalabra();
        }
        return(devolver);
    }
}
