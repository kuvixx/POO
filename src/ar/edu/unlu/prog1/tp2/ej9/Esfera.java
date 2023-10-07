package ar.edu.unlu.prog1.tp2.ej9;

public class Esfera extends Figura_3_dimensiones{

    private float radio;

    public void calcular_area(){
        this.area = 4*Math.PI*radio*radio;
    }

    public void calcular_volumen(){
        this.volumen = (4/3) * Math.PI * radio * radio * radio;
    }
}
