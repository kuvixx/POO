package ar.edu.unlu.prog1.tp2.ej8;

import ar.edu.unlu.prog1.tp2.ej2.Cliente;
import ar.edu.unlu.prog1.tp2.ej6y7.Expendedor;

import java.util.ArrayList;

public class Libro extends Publicacion{

    private int año_publicacion;
    private String isbn ;
    private int num_Ejemplares = 0;
    private int num_Ejemplares_plestados = 0;

    private  ArrayList<Socio> listado_socio_prestamo = new ArrayList<Socio>();

    public void setLibro(String nombre, String autor, int paginas, int ejemplares){
        this.nombre = nombre;
        this.autor = autor;
        this.num_Ejemplares = ejemplares;

    }

    public void mostrarLibro(){
        String cadena = "nombre: "+ this.nombre + ", autor: " + this.autor  + ", ejemplares: "+ this.num_Ejemplares;
        System.out.println(cadena);
    }


    public String getNombre() {
        return nombre;
    }

    public int getNum_Ejemplares() {
        return num_Ejemplares;
    }
    public void prestar_ejemplar(Socio socio){
        if (this.num_Ejemplares > 1) {
            this.num_Ejemplares_plestados++;
            this.num_Ejemplares--;
            this.listado_socio_prestamo.add(socio);
        } else {
            System.out.println("No se puede prestar ejemplar, solo queda uno disponible");
        }
    }
    public int getNum_Ejemplares_plestados() {
        return num_Ejemplares_plestados;
    }
}
