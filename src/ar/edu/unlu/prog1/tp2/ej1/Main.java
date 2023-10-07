package ar.edu.unlu.prog1.tp2.ej1;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Credencial> listasocios = new ArrayList<Credencial>();




    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (sc.nextInt() != 0){
            Credencial credencialnueva = new Credencial();
            credencialnueva.alta_credencial();
            listasocios.add(credencialnueva);
            credencialnueva.alta_credencial();
            listasocios.add(credencialnueva);
        }

        int id_sus = sc.nextInt();
        System.out.println(Actividades.verificar_actividades(id_sus));

        String basica = "";
        String intermedia = "";
        String destacada = "";
        for (int i= 0; i < listasocios.size() ; i ++){
            Credencial credencial = listasocios.get(i);
            switch (credencial.getTipo_suscripcion().get_id_suscripcion()){
                case 0:  basica = basica + credencial.getSocio().getNombre_ape() + "\nun";break;
                case 1: intermedia = intermedia + credencial.getSocio().getNombre_ape() + "\nun";break;
                case 2: destacada = destacada + credencial.getSocio().getNombre_ape() + "\nun";break;
                default:
                    System.out.println("error");
            }
        }
        System.out.println("Basica: " + basica);
        System.out.println("Intermedia: " + intermedia);
        System.out.println("Destacada: " + destacada);
        String sociosnuevos = "";
        for (int i= 0; i < listasocios.size() ; i ++){
            Credencial credencial = listasocios.get(i);
            ;
            if (credencial.getSocio().getFecha_inscripcion().isAfter(LocalDate.now().minusDays(-30)) ){
                sociosnuevos = sociosnuevos + credencial.getSocio().getNombre_ape() + "\nun";
            }
        }
        System.out.println(sociosnuevos);

    }




}
