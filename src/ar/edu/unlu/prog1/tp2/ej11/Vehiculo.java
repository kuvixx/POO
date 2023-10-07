package ar.edu.unlu.prog1.tp2.ej11;

public class Vehiculo {

    double precio_base = 3000.0;
    String patente;
    boolean alquilado = false;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public double devolver_valor_final(){
        return precio_base;
    }
    public void alquilar(){
        this.alquilado = true;
    }
}
