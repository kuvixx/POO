package ar.edu.unlu.prog1.tp2.ej13;

public class ReciboSueldo {

    private Persona persona;
    private Tripulante tripulante;
    private double sueldo;

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setTripulante(Tripulante tripulante) {
        this.tripulante = tripulante;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Tripulante getTripulante() {
        return tripulante;
    }

    public Persona getPersona() {
        return persona;
    }


}
