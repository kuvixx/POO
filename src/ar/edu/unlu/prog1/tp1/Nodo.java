package ar.edu.unlu.prog1.tp1;

public class Nodo {
    private Object dato;
    private Nodo proximo = null;
    //get obtiene datos
    //set coloca datos
    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }
    public void setProximo(Nodo nodo){
        this.proximo = nodo;
    }
    public Nodo getProximo(){
        return proximo;
    }
}
