package ar.edu.unlu.prog1.tp2.ej6y7;

import java.time.LocalDate;

public class Venta {

    private LocalDate fecha;
    private float importeTotal;
    private float litros_combustible;
    private Expendedor expendedor;
    private Empleado empleado;
    private Cliente cliente;

    public void registrar_venta(Expendedor exp , float litros_combustible, Empleado empl, Cliente clien){
        this.fecha = LocalDate.now();
        this.expendedor = exp;
        this.importeTotal = exp.getCombustible().getPrecio_venta() * litros_combustible;
        this.litros_combustible = litros_combustible;
        this.empleado = empl;
        this.cliente = clien;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public float getImporteTotal() {
        return importeTotal;
    }
}
