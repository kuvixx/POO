package ar.edu.unlu.prog1.tp2.ej11;

public class Camioneta_flete extends Vehiculo{

    Double peso_autorizado_total ;


    public void setPeso_autorizado_total(Double peso_autorizado_total) {
        this.peso_autorizado_total = peso_autorizado_total;
    }

    public double devolver_valor_final(){
        return (precio_base+(600*peso_autorizado_total));
    }
}
