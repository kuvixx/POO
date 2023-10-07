package ar.edu.unlu.prog1.tp2.ej13;

import ar.edu.unlu.prog1.tp2.ej11.Vehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

    public static ArrayList<Persona> personas = new ArrayList<Persona>();
    public static ArrayList<ReciboSueldo> recibos_de_sueldos = new ArrayList<ReciboSueldo>();


    public Ticket asignar_pasajero_a_vuelo(Vuelo vuelo, Persona persona){
        Scanner sc = new Scanner(System.in);
        Pasajero pasajero = new Pasajero();
        String numero_pasajero = "" + sc.nextInt();
        persona.modificar_rol(pasajero);
        vuelo.agregar_miembro_vuelo(persona);
        Ticket ticket = new Ticket();
        ticket.setPasajero(pasajero);
        ticket.setVuelo(vuelo);
        return ticket;
    }

    public void asignar_tripulante_a_vuelo(Vuelo vuelo, Persona persona){
        //no se me ocurrio la manera optima de pasar a un tripulante que antes fue pasajero a ser tripulante de nuevo. Lo hice de esta manera que no me convenció.
        for (int i= 0; i < recibos_de_sueldos.size() ; i ++){
            ReciboSueldo recibo = recibos_de_sueldos.get(i);
            if (recibo.getPersona().equals(persona)){
                persona.modificar_rol(recibo.getTripulante());
                break;
            }
        }

    }


}
