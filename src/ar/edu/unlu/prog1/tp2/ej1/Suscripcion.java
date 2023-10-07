package ar.edu.unlu.prog1.tp2.ej1;

public class Suscripcion {
    // basica, intermedia, ultima
    //0,1,2
    private String tipo_suscripcion = "básica";
    private int id_suscripcion = 0;

    public int get_id_suscripcion(){
        return id_suscripcion;
    }

    public void setSuscripcion(int id){
        this.id_suscripcion = id;
        switch (id){
            case 0: this.tipo_suscripcion = "básica"; break;
            case 1: this.tipo_suscripcion = "intermedia"; break;
            case 2: this.tipo_suscripcion = "Pro"; break;
            default:
                System.out.println("error");
        }
    }

    public String getTipo_suscripcion() {
        return tipo_suscripcion;
    }
}
