package ar.edu.unlu.prog1;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public void agregarLibro(){
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

}
