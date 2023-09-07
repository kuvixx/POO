package ar.edu.unlu.prog1.tp1.eje6;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private static ArrayList<Libro> libros = new ArrayList<Libro>();

    public static void agregarLibro(){
        Scanner sc = new Scanner(System.in);
        String libro;
        String autor;
        int paginas;
        int cantidad_ejemplares;
        System.out.println("Libro");
        libro = sc.nextLine();
        System.out.println("autor");
        autor = sc.nextLine();
        System.out.println("paginas");
        paginas = sc.nextInt();
        System.out.println("cantidad ejemplares");
        cantidad_ejemplares = sc.nextInt();
        Libro libro1 = new Libro();
        libro1.setLibro(libro,autor,paginas,cantidad_ejemplares);
        libros.add(libro1);
        libros.get(0).mostrarLibro();

    }
    public static void cargarYCompararPaginas(){
        agregarLibro();
        agregarLibro();
        libros.get(0).mostrarLibro();
        libros.get(1).mostrarLibro();

        if (libros.get(0).getPaginas() > libros.get(1).getPaginas()){
            System.out.println("Libro 0 mas paginas");
        } else {
            System.out.println("Libro 1 mas paginas");
        }
    }

    public static void prestarLibro(int indiceLibro){
        libros.get(indiceLibro).prestar_ejemplar();
    }

    public static void mostrarPrestamos(){
        int devolver = 0;
        for (int i = 0; i < libros.size(); i++){
            devolver = devolver  + libros.get(i).getNum_Ejemplares_plestados();
        }
        System.out.println(devolver);
    }
    public static void main(String[] args){
        agregarLibro();
        cargarYCompararPaginas();
        prestarLibro(1);
        System.out.println("Cantidad de libros prestados : ");
        mostrarPrestamos();


    }


}
