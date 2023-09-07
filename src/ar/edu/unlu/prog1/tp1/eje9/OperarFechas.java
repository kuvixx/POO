package ar.edu.unlu.prog1.tp1.eje9;

import ar.edu.unlu.prog1.tp1.eje9.OpeFechas;

import java.time.LocalDate;

public class OperarFechas {
    public static void main(String[] args){
        System.out.println(OpeFechas.transformar("20-5-2005").toString());
        LocalDate fecha2 = OpeFechas.transformar("06-9-2023");
        LocalDate fecha1 = OpeFechas.transformar("1-9-2023");
        LocalDate fecha3 = OpeFechas.transformar("3-9-2023");
        if (OpeFechas.entreFechas(fecha1, fecha2, fecha3)){
            System.out.println("Fecha 3 está entre fecha 1 y 2");
        } else {
            System.out.println("Fecha 3 NO está entre fecha 1 y 2");
        }

        if (OpeFechas.esMayor(fecha1, fecha3)){
            System.out.println("FECHA 3 ES MAYOR QUE FECHA 1");
        }

        if (OpeFechas.esMenor(fecha2, fecha1)){
            System.out.println("FECHA 1 ES MENOR QUE FECHA 2");
        }
    }
}
