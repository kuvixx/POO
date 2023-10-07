package ar.edu.unlu.prog1.tp2.ej9;

public class Triangulo extends Figura_geometrica{
    private float base;
    private float altura;

    public void calcular_area(){
        this.area = base*(altura/2);
    }
}
