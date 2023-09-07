package ar.edu.unlu.prog1.tp1.eje3;

import ar.edu.unlu.prog1.tp1.Nodo;

public class Pila {
    /*
    Private class cantidad no es necesaria

    Metodos:
    Apilar( Object dato ) : Void
    Desapilar() : Object
    Recuperar(): Object
    Longitud(): int
    Mostrar(): void

    Nodo:
    Private object dato.
     */
    private ar.edu.unlu.prog1.tp1.Nodo cabeza = null;


    public void apilar(Object dato){
        ar.edu.unlu.prog1.tp1.Nodo nuevoNodo = new ar.edu.unlu.prog1.tp1.Nodo();
        nuevoNodo.setDato(dato);

        if(cabeza == null){
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.setProximo(cabeza);
            cabeza = nuevoNodo;
        }
    }

    public Object recuperar(){
        if (cabeza != null) {
            return (cabeza.getDato());
        } else {
            System.out.println("Pila vacía");
            return (null);
        }
    }

    public void desapilar(){
        if (cabeza != null) {
            ar.edu.unlu.prog1.tp1.Nodo nuevoNodo = new Nodo();
            nuevoNodo = cabeza.getProximo();
            cabeza = nuevoNodo;
        } else {
            System.out.println("Pila vacía");
        }
    }

    public int longitud(){
        Pila pilaaux = new Pila();
        int i = 0;
        while (recuperar() != null) {
            i ++;
            pilaaux.apilar(recuperar());
            desapilar();
        }

        while (pilaaux.recuperar() != null) {
            apilar(pilaaux.recuperar());
            pilaaux.desapilar();
        }

        return (i);
    }

    public void mostrar(){
        Pila pilaaux = new Pila();
        String cadena = "";
        while (recuperar() != null) {
            pilaaux.apilar(recuperar());
            desapilar();
        }

        while (pilaaux.recuperar() != null) {
            cadena = cadena + recuperar();
            apilar(pilaaux.recuperar());
            pilaaux.desapilar();
        }
        System.out.println(cadena);
    }


}
