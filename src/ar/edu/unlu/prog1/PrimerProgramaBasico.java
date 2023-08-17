package ar.edu.unlu.prog1;

import java.util.Scanner;

public class PrimerProgramaBasico {
    /**
     * Puntos de entrada de mi aplicación
     *
     * @param argumentos : Lista de argumentos de inicio
     */

    public static void main(String[] argumentos) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        String opcion;
        do {
            System.out.print("Dame 3 números enteros : ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            // Se puede usar && como "And"
            if ((a >= b) && (a >= c)) {
                System.out.println("El numero mayor es C :" + c);
            } else {
                if (b >= c) {
                    System.out.println("El numero mayor es B :" + b);
                } else {
                    System.out.println("El numero mayor es C :" + c);
                }
            }
            sc.nextLine();
            System.out.println("Quiere probar de nuevo (S/N)?");
            opcion = sc.nextLine();
        } while (opcion.equals("s") || opcion.equals("S"));
        System.out.println("Fin del programa");


    }
}