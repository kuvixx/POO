package ar.edu.unlu.prog1.tp2.ej2;

import ar.edu.unlu.prog1.tp2.ej1.Credencial;

import java.util.ArrayList;

public class Paquete_turismo {

    private  ArrayList<Excursion> excursiones = new ArrayList<Excursion>();
    private Hospedaje hospedaje;
    private Medio_transporte tranporte;
    private String destino;

    private double valor_final;


    public void setearTodo(ArrayList<Excursion> excursiones, Hospedaje hospedaje,double valor_final , Medio_transporte tranporte, String destino){
        this.excursiones = excursiones;
        this.hospedaje = hospedaje;
        this.tranporte = tranporte;
        this.valor_final = valor_final;
        this.destino = destino;

    }


    public String getDestino() {
        return destino;
    }

    public ArrayList<Excursion> getExcursiones() {
        return excursiones;
    }

    public double getValor_final() {
        return valor_final;
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    public Medio_transporte getTranporte() {
        return tranporte;
    }

}
