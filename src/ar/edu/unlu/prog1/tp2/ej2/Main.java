package ar.edu.unlu.prog1.tp2.ej2;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Excursion> excursiones = new ArrayList<Excursion>();
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public  static ArrayList<Hospedaje> hospedajes = new ArrayList<Hospedaje>();
    public  static ArrayList<Paquete_turismo> paquetes = new ArrayList<Paquete_turismo>();

    public static ArrayList<Venta> ventas = new ArrayList<Venta>();

    public static void main(String[] args){
        Cliente cliente = new Cliente();
        Hospedaje hospedaje = new Hospedaje();
        Excursion excursion = new Excursion();
        ArrayList<String> destinos = new ArrayList<String>();
        String destino ;
        for (int i= 0; i < ventas.size() ; i ++){
            destino = ventas.get(i).getPaquete().getDestino();
            destinos.add(destino);
        }
        destinos.sort(null);
        System.out.println("destinos: \nun ");
        for (int i= 0; i < destinos.size() ; i ++){
            System.out.println(destinos.get(i)+ " \nun");
        }

    }
}
