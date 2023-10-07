package ar.edu.unlu.prog1.tp2.ej10;

import java.time.LocalDate;

public class Comision extends Empleado{
    private int cantidad_ventas;
    private double porcentaje_venta;

    private double total_ventas;
    private Double bono_por_cumpleaños_extra = (total_ventas*0.005);

    public double calcular_sueldo(){
        double sueldo;
        sueldo = total_ventas*porcentaje_venta;
        if (fecha_nacimiento.getMonth().equals(LocalDate.now().getMonth())){
            sueldo = sueldo + bono_por_cumpleaños + bono_por_cumpleaños_extra;
        }
        return sueldo;
    }
}
