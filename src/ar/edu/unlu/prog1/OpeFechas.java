package ar.edu.unlu.prog1;
import java.time.LocalDate;

public class OpeFechas {

    public static LocalDate transformar(String cadena){
        String[] cadenaspliteada = cadena.split("-");
        System.out.println(cadenaspliteada.length);
        if (cadenaspliteada.length == 3) {
            return (LocalDate.of(Integer.parseInt(cadenaspliteada[2]), Integer.parseInt(cadenaspliteada[1]), Integer.parseInt(cadenaspliteada[0])));
        } else {
            return (LocalDate.now()) ;
        }
    }
    public boolean entreFechas(LocalDate fecha1, LocalDate fecha2, LocalDate entrefecha){
        if (fecha1.isBefore(entrefecha) && fecha2.isAfter(entrefecha)){
            return(true);
        }else {
            return (false);
        }
    }

    public boolean esMayor(LocalDate fecha1, LocalDate fechaComparar){
        return (fechaComparar.isAfter(fecha1));
    }

    public boolean esMenor(LocalDate fecha1, LocalDate fechaComparar){
        return (fechaComparar.isBefore(fecha1));
    }

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.of(2006,5,5); // Create a date object
        System.out.println(myObj); // Display the current date
        System.out.println(OpeFechas.transformar("20-5-2005").toString());

    }
}
