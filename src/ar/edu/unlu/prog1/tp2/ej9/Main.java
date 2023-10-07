package ar.edu.unlu.prog1.tp2.ej9;

import ar.edu.unlu.prog1.tp2.ej2.Excursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Figura_geometrica> formas = new ArrayList<Figura_geometrica>();

    public static ArrayList<Figura_3_dimensiones> formas3d = new ArrayList<Figura_3_dimensiones>();

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Circulo circulo= new Circulo();
        Cuadrado cuadrado= new Cuadrado();
        Esfera esfera= new Esfera();
        Cubo cubo= new Cubo();

    }

    public void mostrar_areas(){
        for (int i= 0; i < formas.size() ; i ++){
            System.out.println(formas.get(i).getArea());
        }
    }
}
