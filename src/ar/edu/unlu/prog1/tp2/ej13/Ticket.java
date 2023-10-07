package ar.edu.unlu.prog1.tp2.ej13;

import ar.edu.unlu.prog1.tp2.ej11.Cliente;

public class Ticket {
    private Vuelo vuelo;
    private Pasajero pasajero;

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}
