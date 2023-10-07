package ar.edu.unlu.prog1.tp2.ej1;

public class Actividades {

    public static String verificar_actividades(int id_sus) {
        switch (id_sus) {
            case 0:
                return ("ingresar al complejo, ingresar a la cancha de futbol, ingresar a la cancha de basquet, ingresar a la cancha de tenis, sacar entradas, ingresar a la cafeteria");
            case 1:
                return ("BASICAS: ingresar al complejo, ingresar a la cancha de futbol, ingresar a la cancha de basquet, ingresar a la cancha de tenis, sacar entradas, ingresar a la cafeteria. INTERMEDIA: ingresar al museo.");
            case 2:
                return ("BASICAS: ingresar al complejo, ingresar a la cancha de futbol, ingresar a la cancha de basquet, ingresar a la cancha de tenis, sacar entradas, ingresar a la cafeteria. INTERMEDIA: ingresar al museo. DESTACADA: Reservar canchas, Ir a los palcos.");
            default:
                return ("valor incorrecto");
        }
    }

    public boolean ingresar_al_complejo(int id_sus){
        if (id_sus >= 0){
            return true;
        } else return false;
    }
    public boolean ingresar_a_la_cancha_futbol(int id_sus){
        if (id_sus >= 0){
            return true;
        } else return false;
    }
    public boolean ingresar_a_la_cancha_basquet(int id_sus){
        if (id_sus >= 0){
            return true;
        } else return false;
    }
    public boolean ingresar_a_la_cancha_tenis(int id_sus){
        if (id_sus >= 0){
            return true;
        } else return false;
    }
    public boolean sacar_entradas(int id_sus){
        if (id_sus >= 0){
            return true;
        } else return false;
    }
    public boolean ingresar_a_cafeteria(int id_sus){
        if (id_sus >= 0){
            return true;
        } else return false;
    }
    public boolean ingresar_al_museo(int id_sus){
        if (id_sus >= 1){
            return true;
        } else return false;
    }
    public boolean ingresar_a_los_palcos(int id_sus){
        if (id_sus >= 2){
            return true;
        } else return false;
    }
    public boolean reservar_canchas(int id_sus){
        if (id_sus >= 2){
            return true;
        } else return false;
    }
}
