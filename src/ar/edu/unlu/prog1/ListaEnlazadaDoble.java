package ar.edu.unlu.prog1;

public class ListaEnlazadaDoble {
    private NodoDoble primero = null;
    private NodoDoble ultimo = null;
    private int longitud = 0;


    public void agregar(Object dato){
        NodoDoble nuevoNodo = new NodoDoble();
        nuevoNodo.setDato(dato);

        if(primero == null){
            primero = nuevoNodo;
        } else {
            NodoDoble nodoAux = primero;
            while (nodoAux.getProximo() != null) {
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(nuevoNodo);
            nuevoNodo.setAnterior(nodoAux);
        }
        this.longitud ++;
    }



    public String toString(){
        NodoDoble nodoAux = primero;
        String acumulador = "";
        Integer i = 1;
        if(primero == null){
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
        NodoDoble nodoAux = primero;
        Integer i = 1;
        boolean encontrado = false;
        if(primero == null || iBorrar>this.longitud){
            return(false);
        } else {
            while (nodoAux.getProximo() != null || encontrado ) {
                if ((i + 1) == iBorrar ){
                    if (nodoAux.getProximo().getProximo() == null){
                        nodoAux.setProximo(null);
                    } else {
                        nodoAux.getProximo().getProximo().setAnterior(nodoAux);
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
        NodoDoble nodoAux = primero;
        Integer i = 1;
        NodoDoble nuevoNodo = new NodoDoble();
        nuevoNodo.setDato(dato);
        boolean insertado =false;
        if(primero == null || pos>this.longitud){
            return(false);
        } else {
            while (insertado) {
                if ((i + 1) == pos ){
                    nodoAux.getProximo().setAnterior(nuevoNodo);
                    nuevoNodo.setProximo(nodoAux.getProximo());
                    nuevoNodo.setAnterior(nodoAux);
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
