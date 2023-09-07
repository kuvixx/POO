package ar.edu.unlu.prog1.tp1.eje1;

import ar.edu.unlu.prog1.tp1.Nodo;

public class ListaEnlazada {
    private ar.edu.unlu.prog1.tp1.Nodo primero = null;
    private int longitud = 0;


    public void agregar(Object dato){
        ar.edu.unlu.prog1.tp1.Nodo nuevoNodo = new ar.edu.unlu.prog1.tp1.Nodo();
        nuevoNodo.setDato(dato);

        if(this.primero == null){
            this.primero = nuevoNodo;
        } else {
            ar.edu.unlu.prog1.tp1.Nodo nodoAux = this.primero;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
        }
        this.longitud ++;
    }

    public void agregarAlFinal(Object dato){
        ar.edu.unlu.prog1.tp1.Nodo nuevoNodo = new ar.edu.unlu.prog1.tp1.Nodo();
        nuevoNodo.setDato(dato);
        ar.edu.unlu.prog1.tp1.Nodo nodoAux = this.primero;
        while (nodoAux.getProximo() != null) {
            nodoAux = nodoAux.getProximo();
        }
        nodoAux.setProximo(nuevoNodo);

        this.longitud ++;
    }

    public String toString(){
        ar.edu.unlu.prog1.tp1.Nodo nodoAux = primero;
        String acumulador = "";
        Integer i = 1;
        if(this.primero == null){
            acumulador = "";
        } else {
            while (nodoAux.getProximo() != null) {
                acumulador += "Nodo " + i + " " + nodoAux.getDato() + "\n";
                i++;
                nodoAux = nodoAux.getProximo();
            }
            acumulador += "Nodo " + i + " " + nodoAux.getDato();
        }
        return acumulador;
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

    public boolean eliminarElemento(int iBorrar){
        ar.edu.unlu.prog1.tp1.Nodo nodoAux = this.primero;
        Integer i = 1;
        boolean encontrado = false;
        if(this.primero == null || iBorrar>this.longitud){
            return(false);
        } else {
            while (nodoAux.getProximo() != null || encontrado ) {
                if ((i + 1) == iBorrar ){
                    if (nodoAux.getProximo().getProximo() == null){
                        nodoAux.setProximo(null);
                    } else {
                        nodoAux.setProximo(nodoAux.getProximo().getProximo());
                    }
                    encontrado = true;
                }
                i++;
                nodoAux = nodoAux.getProximo();
            }
        }
        return(encontrado);
    }
    public boolean insertarPosEspecifica(int pos, Object dato){
        ar.edu.unlu.prog1.tp1.Nodo nodoAux = this.primero;
        Integer i = 1;
        ar.edu.unlu.prog1.tp1.Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        boolean insertado =false;
        if(this.primero == null || pos>this.longitud){
            return(false);
        } else {
            while (insertado) {
                if ((i + 1) == pos ){
                    nuevoNodo.setProximo(nodoAux.getProximo());
                    nodoAux.setProximo(nuevoNodo);
                    insertado = true;
                }
                i++;
                nodoAux = nodoAux.getProximo();
            }
        }
        return(insertado);

    }


}
