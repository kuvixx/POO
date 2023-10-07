package ar.edu.unlu.prog1.tp2.ej10;

import java.time.LocalDate;

public class Asalariado_Fulltime extends Empleado{
    private double suma_fija_mensual;

    private Double bono_por_cumpleaños_extra = 1000.0;

    public double calcular_sueldo(){
        double sueldo;
        sueldo = suma_fija_mensual;
        if (fecha_nacimiento.getMonth().equals(LocalDate.now().getMonth())){
            sueldo = sueldo + bono_por_cumpleaños + bono_por_cumpleaños_extra;
        }
        return sueldo;
    }
}
