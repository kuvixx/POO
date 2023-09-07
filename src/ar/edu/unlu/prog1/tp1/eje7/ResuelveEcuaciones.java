package ar.edu.unlu.prog1.tp1.eje7;

import ar.edu.unlu.prog1.tp1.eje7.Ecuacion2Grado;

public class ResuelveEcuaciones {

    public static void main(String[] args){
        Ecuacion2Grado nuevaEcuacion = new Ecuacion2Grado();

        nuevaEcuacion.setCoeficientes(2, 2 , 2);
        System.out.println(nuevaEcuacion.devolverRaicesString());
        System.out.println(nuevaEcuacion.resolverEcuacionPorX(5));
        System.out.println(nuevaEcuacion.resolverEcuacionPorX(3));
        System.out.println(nuevaEcuacion.resolverEcuacionPorX(2));
    }
}
