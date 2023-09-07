package ar.edu.unlu.prog1.tp1.eje4;

import ar.edu.unlu.prog1.tp1.Nodo;

public class Cola {
    private ar.edu.unlu.prog1.tp1.Nodo primero = null;

    private int longitud = 0;

    /*
        Metodos:
    Apilar( Object dato ) : Void
    Desapilar() : Object
    Recuperar(): Object
    Longitud(): int
    Mostrar(): void
     */
    public void encolar(Object dato) {
        ar.edu.unlu.prog1.tp1.Nodo nuevoNodo = new ar.edu.unlu.prog1.tp1.Nodo();
        nuevoNodo.setDato(dato);

        if(primero == null){
            primero = nuevoNodo;
        } else {
            ar.edu.unlu.prog1.tp1.Nodo nodoAux = primero;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
        }
        this.longitud ++;
    }

    public Object desencolar(){
        Nodo nodoAux = this.primero;
        this.primero = nodoAux.getProximo();
        this.longitud --;
        return (nodoAux.getDato());

    }

    public boolean esVacia(){
        if (this.primero == null){
            return(true);
        }else {
            return(false);
        }
    }
    public int longitud(){
        return(this.longitud);
    }


}
