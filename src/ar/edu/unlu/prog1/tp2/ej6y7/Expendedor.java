package ar.edu.unlu.prog1.tp2.ej6y7;

public class Expendedor {
    private int codigo;

    private Combustible combustible;


    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public Combustible getCombustible() {
        return combustible;
    }
}
