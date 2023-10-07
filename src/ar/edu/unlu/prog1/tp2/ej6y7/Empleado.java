package ar.edu.unlu.prog1.tp2.ej6y7;

public class Empleado {

    private String apellidos;
    private String nombre;
    private String dni;
    private String telefono;
    private String direccion;

    public Empleado(String apellido, String nombre, String dni, String telefono, String direccion){
        this.apellidos = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    public String getDni() {
        return dni;
    }
}
