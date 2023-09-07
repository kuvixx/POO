package ar.edu.unlu.prog1.tp1.eje6;

public class Libro {

    private String nombre = "";
    private String autor = "";
    private int paginas = 0;
    private int num_Ejemplares = 0;
    private int num_Ejemplares_plestados = 0;

    public void setLibro(String nombre, String autor, int paginas, int ejemplares){
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
        this.num_Ejemplares = ejemplares;

    }

    public void mostrarLibro(){
        String cadena = "nombre: "+ this.nombre + ", autor: " + this.autor + ", paginas: "+ this.paginas + ", ejemplares: "+ this.num_Ejemplares;
        System.out.println(cadena);
    }

    public int getPaginas() {
        return paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNum_Ejemplares() {
        return num_Ejemplares;
    }
    public void prestar_ejemplar(){
        if (this.num_Ejemplares > 1) {
            this.num_Ejemplares_plestados++;
            this.num_Ejemplares--;
        } else {
            System.out.println("No se puede prestar ejemplar, solo queda uno disponible");
        }
    }
    public int getNum_Ejemplares_plestados() {
        return num_Ejemplares_plestados;
    }
}
