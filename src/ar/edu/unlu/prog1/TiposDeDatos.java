package ar.edu.unlu.prog1;

public class TiposDeDatos {
    public static void main(String[] args){
        int entero = 1999;
        byte b1=125;
        float b2 = 2000000.0f;
        System.out.println("entero" + entero);
        System.out.println("b1"+ b1);
        System.out.println("b2"+b2);
        b2 = entero;
        System.out.println("entero casteado desde float" + b2);
        entero = (int) b2;
        System.out.println("float casteado a int" + entero);
        int aa = 254;
        b1=(byte)aa;
        System.out.println("entero casteado desde byte"+ b1);
        String cantidad = "1";
        int pruebaDesdeString = Integer.valueOf(cantidad);
        String a = "Clase de POO";
        String b = new String("Clase de POO");
        String c = "Clase de POO";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b.equals(a));

        Integer i1 = 1 ;
        Integer i2 = 2 ;
        Integer i3 = 3;

        i2=i2+1;
    }
}
