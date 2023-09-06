package ar.edu.unlu.prog1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaDeTareas {
    /*

     */
    private static ArrayList<Tarea> miLista = new ArrayList<Tarea>();

    public void agregarTarea(){
        Tarea tareaNueva = new Tarea();
        LocalDate fecha_limite = null;
        String descripcion;
        byte prioridad = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa descripción de la tarea");
        descripcion = sc.next();
        tareaNueva.setDescripcion(descripcion);
        boolean validado = false;
        System.out.println("Ingresar fecha limite en formato 'dd-mm-aaaa' '");
        while(validado) {
            try {
                fecha_limite = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd-mm-yyyy"));
                validado= true;
            } catch (Exception e) {
                System.out.println("Fecha mal cargada, ingrese una fecha valida ('dd-mm-yyyy')");
            }
        }
        System.out.println("Ingrese prioridad de la tarea del 0 al 10, siendo 0 = nada importante ó 10 = Urgente");
        validado = false;
        while(validado) {
            try {
                prioridad = sc.nextByte();
                validado = true;
            }catch (InputMismatchException ex){
                System.out.println("Prioridad mal ingresada, ingrese del 0 al 10");
            }
        }
        validado= false;
        boolean hecha;
        System.out.println("La tarea está resuelta?S para si, N para no");
        String sino = sc.next().toLowerCase();
        while (sino != "s" || sino != "n"){
            System.out.println("Ingrese un valor valido");
            sino = sc.next();

        }
        if (sino.equals("s")){
            hecha = true;
        }else {
            hecha = false;
        }
        tareaNueva.setDescripcion(descripcion);
        tareaNueva.setFecha_limite(fecha_limite);
        tareaNueva.setPrioridad(prioridad);
        tareaNueva.setHecha(hecha);
        miLista.add(tareaNueva);
    }

    public static void cargarTareaValidadaTP(String descripcion, LocalDate fecha_limite, byte prioridad, boolean hecha){
        Tarea tareaNueva = new Tarea();
        tareaNueva.setDescripcion(descripcion);
        tareaNueva.setFecha_limite(fecha_limite);
        tareaNueva.setPrioridad(prioridad);
        tareaNueva.setHecha(hecha);
        miLista.add(tareaNueva);
    }

    public static void main(String[] args){
        LocalDate fecha_limite = LocalDate.now();

        cargarTareaValidadaTP("Ir al supermercado mañana",LocalDate.now().plusDays(1), (byte) 5, false );
        cargarTareaValidadaTP("Consultar repuesto del auto", LocalDate.now().plusDays(-1),(byte) 9, true);
        cargarTareaValidadaTP("Ir al cine a ver la nueva pelicula de Marvel", LocalDate.now().plusDays(-1), (byte) 2, false);


    }
}
