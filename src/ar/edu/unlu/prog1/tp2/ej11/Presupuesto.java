package ar.edu.unlu.prog1.tp2.ej11;

public class Presupuesto {

    private Vehiculo vehiculo;
    private int dias_alquiler;
    private double monto_final;
    private Cliente cliente;
    private boolean aprobado ;

    public Presupuesto(Vehiculo vehiculo, int dias_alquiler, Cliente cliente){
        this.cliente = cliente;
        this.dias_alquiler = dias_alquiler;
        this.vehiculo = vehiculo;
        this.monto_final = vehiculo.devolver_valor_final()* dias_alquiler;
    }

    public double getMonto_final() {
        return monto_final;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getDias_alquiler() {
        return dias_alquiler;
    }

    public void aprobar() {
        this.aprobado = true;
    }

    public boolean getAprobado(){
        return aprobado;
    }
}
