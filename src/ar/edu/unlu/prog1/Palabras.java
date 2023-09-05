package ar.edu.unlu.prog1;

public class Palabras {
    /*
    atributo:
    palabra
    puntajePalabra
    cantidadLetras

    metodos:
    setPalabra
    calcularPuntaje

    las letras k, z, x, y, w, q suman un punto más.
     */
    private String palabra = "";
    private int puntajePalabra = 0;
    private int cantidadLetras = 0;

    public void setPalabra(String palabra) {
        palabra = palabra.toLowerCase();
        this.palabra = palabra;
        for (int i = 0; i < palabra.length(); i++) {
            switch (palabra.charAt(i)) {
                case 'k':
                case 'z':
                case 'x':
                case 'y':
                case 'w':
                case 'q':
                    this.puntajePalabra++;
                    this.puntajePalabra++;
                    break;
                default:
                    this.puntajePalabra++;
            }
        }
    }
    public int getPuntajePalabra(){
        return(this.puntajePalabra);
    }

    public String getPalabra() {
        return palabra;
    }
}
