package ar.edu.unlu.prog1.tp1.eje9;
import java.time.LocalDate;

public class OpeFechas {

    public static LocalDate transformar(String cadena){
        String[] cadenaspliteada = cadena.split("-");
        if (cadenaspliteada.length == 3) {
            return (LocalDate.of(Integer.parseInt(cadenaspliteada[2]), Integer.parseInt(cadenaspliteada[1]), Integer.parseInt(cadenaspliteada[0])));
        } else {
            return (LocalDate.now()) ;
        }
    }
    public static boolean entreFechas(LocalDate fecha1, LocalDate fecha2, LocalDate entrefecha){
        if (fecha1.isBefore(entrefecha) && fecha2.isAfter(entrefecha)){
            return(true);
        }else {
            return (false);
        }
    }

    public static boolean esMayor(LocalDate fecha1, LocalDate fechaComparar){
        return (fechaComparar.isAfter(fecha1));
    }

    public static boolean esMenor(LocalDate fecha1, LocalDate fechaComparar){
        return (fechaComparar.isBefore(fecha1));
    }

}
