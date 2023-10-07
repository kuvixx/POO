package ar.edu.unlu.prog1.tp2.ej9;

public class Paralelepipedo extends Figura_3_dimensiones{
    private float arista1;
    private float arista2;
    private float arista3;

    public void calcular_area(){
        this.area = 2* (arista1 * arista2 + arista1 * arista3 + arista2 * arista3);
    }

    public void calcular_volumen(){
        this.volumen = arista1 * arista2 * arista3;
    }
}
