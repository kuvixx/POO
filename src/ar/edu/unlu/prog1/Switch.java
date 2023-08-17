package ar.edu.unlu.prog1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] argumentos){
        Scanner sc = new Scanner(System.in);
        int nota;
        int frecuencia[] = new int[5];
        for (int i= 0; i < 5 ; i ++){
            frecuencia[i] = 0;
        }
        final int DES = 0;
        final int SAFO = 1;
        final int BIEN = 2;
        final int MB = 3 ;
        final int EX = 4;
        String significado[] = {"Desaprobado", "Safo","Aprobado", "Muy bien", "Excelente"};
        for (int i = 1; i <= 10; i++) {
            System.out.print("Nota Nro : "+ i + " : ");
            nota = sc.nextInt();
            switch (nota) {
                case 1:
                case 2:
                case 3:
                    frecuencia[DES] ++;
                    break;
                case 4:
                    frecuencia[SAFO] ++;
                    break;
                case 5:
                case 6:
                    frecuencia[BIEN] ++;
                    break;
                case 7:
                case 8:
                case 9:
                    frecuencia[MB] ++;
                    break;
                case 10:
                    frecuencia[EX] ++;
                    break;
                default:
                    System.out.println("Pusiste cualquier cosa");
            }
        }
        for (int i = 0; i < frecuencia.length; i++){
            System.out.println("Tenemos : " + significado[i] + " : "+ frecuencia[i]);
        }

        for(String s : significado){
            System.out.println(" - " + s);
        }
    }
}
