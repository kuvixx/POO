package ar.edu.unlu.prog1;

public class PrimeraClase {
    /**
     * Punto de entrada de mi aplicación
     * @param argumentos : lista de argumentos de inicio
     */

    public static void main(String[] argumentos){
        //comentario de linea simple
        System.out.println("Hola mundo desde java");
        System.out.print("Hola mundo "); //las dos lineas siguientes
        System.out.println("desde java"); //obtienen el mismo resultado que la primera
        //
        System.out.printf("Hola mundo %s", "desde java");
        System.out.println("Hola de nuevo");

        char ch1, ch2;
        ch1 = 88;
        ch2= 'Y';
        int suma = ch1 + ch2;
        System.out.printf("El valor de ch1 y ch2 son %s y %s respectivamente \n", ch1, ch2);
        System.out.println(ch1 + " " + ch2 + " " + suma);

        byte b;
        int i = 257;
        double d = 323.142;
        System.out.printf("\nConversiones de tipos int a byte");
        b = (byte) i ;
        System.out.printf("valor de n e i %d %d",b,i);
        i = (int )d;
        System.out.printf("valor de n e i %d \t %f\n",i,d);
        b= (byte) d ;
        System.out.printf("valor de i, b, d,  %d %d %f",i,b,d);

        int j = 2;
        System.out.printf("El valor de i : %d\n", i);
        System.out.printf("El valor de j : %d\n", j);
        System.out.printf("El valor de i / j : %f\n",(double) (i) / j);
        System.out.printf("El valor de d : %f\n", d);
        System.out.printf("El valor de d / j : %f\n", d / j);


    }

}
