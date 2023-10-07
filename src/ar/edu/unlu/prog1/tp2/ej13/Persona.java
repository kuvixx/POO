package ar.edu.unlu.prog1.tp2.ej13;

public class Persona{
    private String nombre;
    private String telefono;
    private String direccion;
    private Rol rol;

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Rol getRol() {
        return rol;
    }

    public void modificar_rol(Rol rol){
        this.rol = rol;
    }
}
