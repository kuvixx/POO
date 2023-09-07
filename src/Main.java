import ar.edu.unlu.prog1.tp1.eje6.Biblioteca;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Si quiero saber si el contenido es lo mismo uso .equals , si quiero saber si el id es el mismo uso el ==

    /*
    public static String Eje1(String cad, ArrayList<String> array){
        boolean encontrado = true;
        int i= 0;
        String stringEncontrado = "No encontrado";
        while (encontrado || i != array.size()){
            if (array.get(i) == cad){
                encontrado = false;
                stringEncontrado = array.get(i);
            }
            i ++;
        }

        return (stringEncontrado);
    }
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();
        String aa = "1";
        for (int i = 0; i <10; i++){
            array.add(""+i);
        }
        System.out.println(System.identityHashCode(aa));
        System.out.println(Eje1(aa,array));
        System.out.println(System.identityHashCode(Eje1(aa,array)));


/*
        System.out.println("Hola y bienvenido!");

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        Nodo miNodo = new Nodo();
        miNodo.setDato("Hola mundo");
        System.out.println(miNodo.getDato());
        System.out.println(miNodo);
        Nodo miNodo2 = new Nodo();
        miNodo.setDato("como estas");
        System.out.println(miNodo.getDato());
        System.out.println(miNodo);
        miNodo.setProximo(miNodo2);
        miNodo2.setDato("Bien");
        System.out.println(miNodo2.getDato());
        System.out.println(miNodo2);
        System.out.println(miNodo.getProximo().toString());







    }
 */
    public static void main(String[] argumentos) {
        /*
        Pila pilar = new Pila();
        Scanner sc = new Scanner(System.in);

        String cadena = "";
        while (!Objects.equals(cadena, "N")) {
            cadena = sc.next();
            Object = cadena;
            System.out.println(cadena);
            pilar.apilar(cadena);
        }

        pilar.mostrar();

         */
        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro();


    }
}