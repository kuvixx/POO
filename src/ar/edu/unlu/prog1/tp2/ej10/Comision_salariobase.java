package ar.edu.unlu.prog1.tp2.ej10;

import java.time.LocalDate;

public class Comision_salariobase extends Empleado{

    private double suma_fija_mensual;
    private int cantidad_ventas;
    private double porcentaje_venta;
    private double total_ventas;

    private Double bono_por_cumpleaños_extra = (total_ventas*0.005) +1000 ;

    public double calcular_sueldo(){
        double sueldo;
        sueldo = suma_fija_mensual;
        if (fecha_nacimiento.getMonth().equals(LocalDate.now().getMonth())){
            sueldo = sueldo + bono_por_cumpleaños + bono_por_cumpleaños_extra;
        }
        return sueldo;
    }
}
