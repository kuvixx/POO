package ar.edu.unlu.prog1.tp1.eje5_10_12_13;

import ar.edu.unlu.prog1.tp1.eje5_10_12_13.Tarea;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class ListaDeTareas {
    /*

     */
    private  ArrayList<Tarea> miLista = new ArrayList<Tarea>();

    public  void agregarTarea(){
        //inicializo
        Tarea tareaNueva = new Tarea();
        LocalDate fecha_limite = null;
        LocalDate fecha_recordatorio = null;
        String descripcion;
        byte prioridad = 0;
        Scanner sc = new Scanner(System.in);
        //seteo descripcion
        System.out.println("Ingresa descripción de la tarea");
        descripcion = sc.next();
        tareaNueva.setDescripcion(descripcion);

        //valido fecha limite
        boolean validado = false;
        System.out.println("Ingresar fecha limite en formato 'dd-MM-aaaa' '");
        while(!validado) {
            try {
                fecha_limite = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                validado= true;
            } catch (Exception e) {
                System.out.println("Fecha mal cargada, ingrese una fecha valida ('dd-MM-yyyy')");
            }
        }

        //valido fecha recordatorio
        validado = false;
        System.out.println("Ingresar fecha recordatorio en formato 'dd-MM-aaaa' '");
        while(!validado) {
            try {
                fecha_recordatorio = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                validado= true;
            } catch (Exception e) {
                System.out.println("Fecha mal cargada, ingrese una fecha valida ('dd-MM-yyyy')");
            }
        }


        //valido prioridad
        System.out.println("Ingrese prioridad de la tarea del 0 al 10, siendo 0 = nada importante ó 10 = Urgente");
        validado = false;
        while(!validado) {
            try {
                prioridad = sc.nextByte();
                validado = true;
            }catch (InputMismatchException ex){
                System.out.println("Prioridad mal ingresada, ingrese del 0 al 10");
            }
        }

        //valido si la tareas está completa
        validado= false;
        boolean hecha;
        System.out.println("La tarea está resuelta?s para si, n para no");
        String sino = sc.next().toLowerCase();
        String colaborador = "";
        LocalDate fecha_realizada = null;
        while (!Objects.equals(sino, "s") && !Objects.equals(sino, "n")){
            System.out.println("Ingrese un valor valido");
            sino = sc.next();
        }
        if (sino.equals("s")){
            hecha = true;
            System.out.println("Ingrese el nombre de quien la hizo");
            colaborador = sc.next();
            System.out.println("Ingrese la fecha cuando fue realizada, en formato 'dd-MM-aaaa'");
            while(!validado) {
                try {
                    fecha_realizada = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    validado= true;
                } catch (Exception e) {
                    System.out.println("Fecha mal cargada, ingrese una fecha valida ('dd-MM-yyyy')");
                }
            }


        }else {
            hecha = false;
        }


        //termino de setear
        tareaNueva.setFecha_limite(fecha_limite);
        tareaNueva.setPrioridad(prioridad);
        tareaNueva.setHecha(hecha);
        if (hecha) {
            tareaNueva.setColaborador(colaborador);
            tareaNueva.setFecha_finalizacion(fecha_realizada);
        }
        tareaNueva.setFecha_recordatorio(fecha_recordatorio);
        this.miLista.add(tareaNueva);
    }

    public  void cargarTareaValidadaTP(String descripcion, LocalDate fecha_limite, byte prioridad, boolean hecha){
        Tarea tareaNueva = new Tarea();
        tareaNueva.setDescripcion(descripcion);
        tareaNueva.setFecha_limite(fecha_limite);
        tareaNueva.setFecha_recordatorio(fecha_limite.plusDays(-2));
        tareaNueva.setPrioridad(prioridad);
        tareaNueva.setHecha(hecha);
        this.miLista.add(tareaNueva);
    }

    public  void mostrarTarea(int i){
        Tarea tareaAux = miLista.get(i);
        if (tareaAux.getFecha_recordatorio().isBefore(LocalDate.now()) && tareaAux.getFecha_recordatorio().isAfter(LocalDate.now())){
            System.out.println("TAREA PROXIMA A VENCER");
        }
        System.out.println("Tarea: "+ tareaAux.getDescripcion());
        System.out.println("Fecha limite: "+  tareaAux.getFecha_limite().toString());
        System.out.println("Fecha recordatorio: "+  tareaAux.getFecha_recordatorio().toString());
        if (tareaAux.getFecha_recordatorio().isBefore(LocalDate.now()) && !tareaAux.isHecha()){
            tareaAux.setPrioridad((byte) 10);
        }
        System.out.println("Prioridad: "+ tareaAux.getPrioridad());
        if (tareaAux.isHecha()){
            System.out.println("La Tarea está completada por " + tareaAux.getColaborador() + " , el dia "+tareaAux.getFecha_finalizacion());
        } else {
            System.out.println("La tarea está incompleta");
        }
        if (tareaAux.isVencida()){
            System.out.println("La Tarea está vencida");
        } else {
            System.out.println("La tarea no está vencida");
        }
    }

    public  void ordernarListaPrioridades(){
        Tarea tareaAux = null;
        for (int i = 0; i< miLista.size(); i++){
            for (int j = 1; j< miLista.size()-i; j++){
                if(miLista.get(j-1).getPrioridad()<miLista.get(j).getPrioridad()) {
                    tareaAux = miLista.get(j-1);
                    this.miLista.set(j-1, miLista.get(j ));
                    this.miLista.set(j , tareaAux);
                } else if (miLista.get(j-1).getPrioridad() == miLista.get(j).getPrioridad()) {
                    if(miLista.get(j-1).getFecha_limite().isAfter(miLista.get(j).getFecha_limite())) {
                        tareaAux = miLista.get(j-1);
                        this.miLista.set(j-1, miLista.get(j ));
                        this.miLista.set(j , tareaAux);
                    }
                }
            }
        }

    }

    public  void mostrarLista(){
        for (int i = 0; i < miLista.size(); i++){
            mostrarTarea(i);
            System.out.println("--------------------------------------------------");
        }
    }

    public void marcarRealizada(int i){
        if (i < miLista.size()) {
            this.miLista.get(i).setHecha(true);
            System.out.println("Ingrese quien realizó la tarea");
            Scanner sc = new Scanner(System.in);
            String colaborador = sc.next();
            System.out.println("Ingrese la fecha cuando fue realizada, en formato 'dd-MM-aaaa'");
            boolean validado = false;
            LocalDate fecha_realizada = null;
            while(!validado) {
                try {
                    fecha_realizada = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                    validado= true;
                } catch (Exception e) {
                    System.out.println("Fecha mal cargada, ingrese una fecha valida ('dd-MM-yyyy')");
                }
            }
            this.miLista.get(i).setColaborador(colaborador);
            this.miLista.get(i).setFecha_finalizacion(fecha_realizada);
        }else {
            System.out.println("No hay tarea que tenga ese indice");
        }
    }

    public void buscarTareaxTitulo(String titulo){
        boolean encontrado = false;
        int i = 0;
        Tarea tareaDevolver = null;
        while (!encontrado && i <= miLista.size()){
            if (Objects.equals(titulo, miLista.get(i).getDescripcion())){
                encontrado =true;
                tareaDevolver = miLista.get(i);
            }
            i++;
        }
        i --;
        if (encontrado) {
            mostrarTarea(i);
        } else {
            System.out.println("Tarea no encontrada");
        }
    }

    public void listaTareasColaborador(String colaborador){
        for (int i = 0; i<miLista.size(); i++){
            if (Objects.equals(miLista.get(i).getColaborador(), colaborador)){
                System.out.println("________________________________________________________________________");
                mostrarTarea(i);
            }
        }
    }


}
