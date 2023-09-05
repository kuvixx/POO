package ar.edu.unlu.prog1;

public class Cola {
    private Nodo primero = null;

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
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if(primero == null){
            primero = nuevoNodo;
        } else {
            Nodo nodoAux = primero;
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
