package ar.edu.unlu.prog1.tp2.ej9;

public class Tetraedro extends Figura_3_dimensiones{

    private float arista;
    private float raiz;

    public void calcular_area(){
        this.area = arista*arista * Math.sqrt(3);
    }

    public void calcular_volumen(){
        this.area = arista*arista*arista * Math.sqrt(2)/12;
    }
}
