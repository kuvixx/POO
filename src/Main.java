import ar.edu.unlu.prog1.Nodo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

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
}