package ar.edu.unlu.prog1.tp2.ej1;

import java.time.LocalDate;

public class Socios {
    private String nombre_ape;
    private String dni;
    private String direccion;
    private String telefono;
    private String mail;
    private LocalDate fecha_inscripcion;

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha_inscripcion(LocalDate fecha_inscripcion)  {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNombre_ape(String nombre_ape) {
        this.nombre_ape = nombre_ape;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDni() {
        return dni;
    }

    public String getMail() {
        return mail;
    }

    public String getNombre_ape() {
        return nombre_ape;
    }

    public String getTelefono() {
        return telefono;
    }

}
