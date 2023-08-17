package ar.edu.unlu.prog1;

import java.util.Scanner;

public class EstructurasDeControl {
    /**
     * Puntos de entrada de mi aplicación
     * @param argumentos : Lista de argumentos de inicio
     */

    public static void main(String[] argumentos) {
        //constantes
        final double PI;
        System.out.println("Hola mundo....");
        PI = 3.1416;
        // PI = 4.1216 NO TE DEJA, LAS VARIABLES FINALS SE PUEDEN ASIGNAR SOLO UNA VEZ
        System.out.println("PI ES : " + PI);
        //operaciones + - / * %(resto)
        int a = 5;
        int b = 7;
        System.out.printf("Resto de dividir 7 en 5: %d \n", (b % a));
        a = a + 1;
        System.out.printf("A = %d\n", a++);
        System.out.printf("A = %d\n", ++a);
        System.out.printf("a = b? %s\n", (a != b));

        Scanner sc = new Scanner(System.in);
        String nombre;
        double radio;
        int n;
        System.out.println("me decis tu nombre por favor : ");
        nombre = sc.nextLine();
        System.out.println("Hola "+nombre );
        System.out.println("me decis un radio de circunferencia:" );
        radio = sc.nextDouble();
        System.out.println("El perimetro es: " + 2 * Math.PI * radio );
        System.out.println("decime tu edad" );
        n =sc.nextInt();
        System.out.println("uuuu  "+n+ " terrible jovie" );


    }
}
