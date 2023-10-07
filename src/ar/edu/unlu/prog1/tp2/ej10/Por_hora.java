package ar.edu.unlu.prog1.tp2.ej10;

public class Por_hora extends Empleado{

    private int cantidad_horas;
    private double monto_por_hora;
    private Double bono_por_cumpleaños_extra= 0.0;

    public double calcular_sueldo(){
        double sueldo;
        sueldo = cantidad_horas*monto_por_hora;
        if (cantidad_horas>40){
            sueldo = sueldo * 1.20;
        }
        return sueldo;
    }
}
