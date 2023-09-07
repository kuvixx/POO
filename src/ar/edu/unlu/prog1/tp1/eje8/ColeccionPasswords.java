package ar.edu.unlu.prog1.tp1.eje8;

import java.util.ArrayList;
import java.util.Scanner;

public class ColeccionPasswords {
    private static ArrayList<Password> coleccionContraseñas = new ArrayList<Password>();


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de contraseñas a crear");
        int cantidadContraseñas = sc.nextInt();

        for (int i = 0; i < cantidadContraseñas; i++){
            Password pass = new Password();
            pass.generarContraseña();
            coleccionContraseñas.add(pass);
        }

        for (int i = 0; i < coleccionContraseñas.size(); i++){
            if (coleccionContraseñas.get(i).isFuerte()){
                System.out.println(coleccionContraseñas.get(i).getPassword() + " - Fuerte");
            }else {
                System.out.println(coleccionContraseñas.get(i).getPassword() + " - Debil");
            }
        }

    }
}
