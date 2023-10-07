package ar.edu.unlu.prog1.tp2.ej3;

import ar.edu.unlu.prog1.tp2.ej2.*;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Credencial> credencials = new ArrayList<Credencial>();
    public static ArrayList<Diagramacion> clases = new ArrayList<Diagramacion>();

    public static ArrayList<Profesor> profesores = new ArrayList<Profesor>();


    public static void main(String Args[]){

        for (int i= 0; i < clases.size() ; i ++){
            Diagramacion clase = clases.get(i);
            int Acum = 0;
            for (int j= 0; j < credencials.size() ; j ++){
                Credencial credencial =credencials.get(j);
                if (credencial.getClases_que_toma().contains(clase)){
                    int idc = credencial.getClases_que_toma().indexOf(clase);
                    Acum = Acum + credencial.getClases_tomadas()[idc];
                }
            }
            System.out.println(clase.getProfesor()+" Le corresponde: $" + Acum*10);
        }
    }
}
