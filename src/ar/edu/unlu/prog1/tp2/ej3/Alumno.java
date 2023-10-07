package ar.edu.unlu.prog1.tp2.ej3;

public class Alumno {

    private String nombre_ape;

    private Credencial credencial;

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public void setNombre_ape(String nombre_ape) {
        this.nombre_ape = nombre_ape;
    }

    public String getNombre_ape() {
        return nombre_ape;
    }
}
