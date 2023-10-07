package ar.edu.unlu.prog1.tp2.ej11;

public class Auto_pasajeros extends Vehiculo{
    int asientos;

    double valor_por_plaza = 300;

    public double devolver_valor_final(){
        return (precio_base+(asientos*valor_por_plaza));
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }
}
