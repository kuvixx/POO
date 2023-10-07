package ar.edu.unlu.prog1.tp2.ej9;

public class Circulo extends Figura_geometrica{
    private double radio;

    public void calcular_area(){
        this.area = Math.PI * radio * radio ;
    }
}
