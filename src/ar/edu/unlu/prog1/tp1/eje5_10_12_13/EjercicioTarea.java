package ar.edu.unlu.prog1.tp1.eje5_10_12_13;

import java.time.LocalDate;
import java.util.Scanner;

public class EjercicioTarea {
    public static void main(String[] args){
        ListaDeTareas miLista = new ListaDeTareas();
        miLista.cargarTareaValidadaTP("Ir al supermercado mañana", LocalDate.now().plusDays(1), (byte) 9, false );
        miLista.cargarTareaValidadaTP("Consultar repuesto del auto", LocalDate.now().plusDays(-1),(byte) 9, true);
        miLista.cargarTareaValidadaTP("Ir al cine a ver la nueva pelicula de Marvel", LocalDate.now().plusDays(-1), (byte) 2, false);
        miLista.mostrarLista();
        miLista.ordernarListaPrioridades();
        System.out.println("DESPUES DE ORDENAR");
        System.out.println("DESPUES DE ORDENAR");
        System.out.println("DESPUES DE ORDENAR");
        miLista.mostrarLista();
        Scanner sc = new Scanner(System.in);
        miLista.agregarTarea();
        System.out.println("ingrese titulo de tarea a buscar");
        miLista.buscarTareaxTitulo(sc.next());

        System.out.println("Ingrese el indice de la tarea a resolver");
        int tareaCompletada = sc.nextInt();
        miLista.marcarRealizada(tareaCompletada);
        miLista.mostrarTarea(tareaCompletada);

        miLista.agregarTarea();
        System.out.println("Ingrese un colaborador para buscar las tareas realizadas por este");
        miLista.listaTareasColaborador("kubi");
    }
}
