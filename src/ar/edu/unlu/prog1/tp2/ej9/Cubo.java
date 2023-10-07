package ar.edu.unlu.prog1.tp2.ej9;

public class Cubo extends Figura_3_dimensiones{

    private float arista;

    public void calcular_area(){
        this.area = 6*arista*arista;
    }
    public void calcular_volumen(){
        this.volumen = arista*arista*arista;
    }
}
