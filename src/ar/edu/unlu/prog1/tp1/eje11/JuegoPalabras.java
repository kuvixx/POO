package ar.edu.unlu.prog1.tp1.eje11;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class JuegoPalabras {

    private static final ArrayList<String> diccionario = new ArrayList<String>();

    public static void agregarPalabraDiccionario(String palabra){
        diccionario.add(palabra);
    }

    public static boolean validarPalabraDiccionario(String palabra){
        return(diccionario.contains(palabra));
    }

    public static void agregarPalabraJugador(JugadorPalabras jugador){
        Scanner sc = new Scanner(System.in);
        boolean palabraValida = false;
        String palabra = "";
        System.out.println("Ingrese palabra para jugador o 0 para salir");
        palabra = sc.next();
        while (!Objects.equals(palabra, "0")){
            palabraValida = false;
            palabraValida = validarPalabraDiccionario(palabra);
            while (!palabraValida) {
                System.out.println("Ingrese una palabra cargada previamente en el diccionario");
                palabra = sc.next();
                palabraValida = validarPalabraDiccionario(palabra);
            }
            jugador.agregarPalabra(palabra);
            System.out.println("Ingrese palabra para jugador o 0 para salir");
            palabra = sc.next();
        }
    }

    public static void declararGanador(JugadorPalabras jugador1, JugadorPalabras jugador2){
        if (jugador1.getPuntosJugador() > jugador2.getPuntosJugador()){
            System.out.println("GANADOR JUGADOR 1 ");
            System.out.println(jugador1.getPuntosJugador()+ " PUNTOS SOBRE " + jugador2.getPuntosJugador() + " PUNTOS");
        } else if (jugador2.getPuntosJugador() > jugador1.getPuntosJugador()) {
            System.out.println("GANADOR JUGADOR 2");
            System.out.println(jugador2.getPuntosJugador()+ " PUNTOS SOBRE " + jugador1.getPuntosJugador() + " PUNTOS");
        } else {
            System.out.println("EMPATE CON "+ jugador2.getPuntosJugador());
        }
    }



    public static void main(String[] argumentos){
        JugadorPalabras jugador1 = new JugadorPalabras();
        JugadorPalabras jugador2 = new JugadorPalabras();
        Scanner sc = new Scanner(System.in);
        boolean palabraValida = false;
        String palabra = "";


        System.out.println("Ingrese palabras para agregar al diccionario o '0' para salir");
        palabra = sc.next();
        while (!Objects.equals(palabra, "0")) {
            agregarPalabraDiccionario(palabra);
            System.out.println("Ingrese palabras para agregar al diccionario o '0' para salir");
            palabra = sc.next();
        }


        System.out.println("Cargar palabras para jugador 1:");
        agregarPalabraJugador(jugador1);

        System.out.println("Cargar palabras para jugador 2:");
        agregarPalabraJugador(jugador2);

        declararGanador(jugador1, jugador2);
    }

}
