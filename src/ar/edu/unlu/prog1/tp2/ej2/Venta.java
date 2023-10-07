package ar.edu.unlu.prog1.tp2.ej2;

import java.lang.reflect.Constructor;
import java.time.LocalDate;

public class Venta {

    private Cliente cliente;

    private Paquete_turismo paquete;
    private LocalDate fecha_venta;

    private void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private void setPaquete(Paquete_turismo paquete) {
        this.paquete = paquete;
    }

    private void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public void registrarVenta(Cliente clie, Paquete_turismo paq){
        setCliente(clie);
        setPaquete(paq);
        setFecha_venta(LocalDate.now());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Paquete_turismo getPaquete() {
        return paquete;
    }
}
