package ar.edu.unlu.prog1.tp2.ej11;

public class Camion extends Vehiculo {

    double precio_base = 0;

    public double devolver_valor_final(int dias){
        double precio;
        precio = dias*100000;
        if (dias >30){
            precio = dias*75000;
        }
        return precio;
    }
}
