package ar.edu.unlu.prog1.tp1.eje8;
import java.util.Random;

public class Password {
    /*
    atributos:
    contraseña = *********
    Longitud = 8;
    fuerte = boolean; más de 2 mayúsculas, más de 1 minúscula y al menos dos números

    metodos=
    cambiarLong.
    generarContraseña
    regenerarFuertemente.
    devolverContraseña

     */
    private String password = null ;
    private int longitud = 8;
    private boolean fuerte = false;

    public void cambiarLong(int longNueva){
        this.longitud = longNueva;
        if (this.password != null){
            generarContraseña();
        }
    }

    public void generarContraseña(){
        String cadena = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        String passAux = "";
        for(int i = 0; i<=this.longitud; i++){
            char c = cadena.charAt(r.nextInt(cadena.length()));
            passAux = passAux + c;
        }

        this.password = passAux;

        verificarFortaleza();
    }

    public void verificarFortaleza(){
        int mayus = 0;
        int minus = 0;
        int numero = 0;
        for (int i = 0; i < this.password.length(); i ++){
            if ((int) this.password.charAt(i) <58 ){
                numero ++;
            } else if ((int) this.password.charAt(i) <91 ) {
                mayus ++;
            } else {
                minus ++;
            }
        }
        if(mayus >2 && minus > 1 && numero>=2){
            this.fuerte = true;
        }else {
            this.fuerte = false;
        }


    }

    public boolean isFuerte() {
        return fuerte;
    }

    public void regenerarFuertemente(){
        while(!isFuerte()){
            generarContraseña();
        }
    }

    public String getPassword() {
        return password;
    }

    public int getLongitud() {
        return longitud;
    }
}
