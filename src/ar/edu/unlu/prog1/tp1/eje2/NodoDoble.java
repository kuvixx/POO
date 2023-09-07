package ar.edu.unlu.prog1.tp1.eje2;

public class NodoDoble {

    private Object dato;
    private NodoDoble proximo = null;
    private NodoDoble anterior = null;
    //get obtiene datos
    //set coloca datos
    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }
    public void setProximo(NodoDoble nodo){
        this.proximo = nodo;
    }
    public NodoDoble getProximo(){
        return proximo;
    }

    public NodoDoble getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}
