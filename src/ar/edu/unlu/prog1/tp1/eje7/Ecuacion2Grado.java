package ar.edu.unlu.prog1.tp1.eje7;

import static java.lang.Math.sqrt;

public class Ecuacion2Grado {
    /*
    coeficiente = a,  b y c
    raices x, y
     */
    private int a ;
    private int b ;
    private int c ;

    public void setCoeficientes(int adada, int bdada, int cdada){
        this.a = adada;
        this.b = bdada;
        this.c = cdada;
    }
    public double resolverEcuacionPorX(int x){
        double resultado = 0;
        /*
           y = a * x^2 + b * x + c

           (-b ± √((b^2) - (4 * a * c))) / (2 * a)
        */

        resultado = this.a * x * x + this.b * x + c;
        return(resultado);
    }

    public String devolverRaicesString(){
        double raizA = 0;
        double raizB = 0;
        double raizCuadrada = ((this.b*this.b)-4*this.a * this.c);
        if (raizCuadrada< 0 ){
            return("La ecuación no tiene solución en numeros reales");
        } else if (raizCuadrada == 0) {
            raizA = (-(this.b)  + Math.sqrt(raizCuadrada)) / 2 *this.a ;
            return("Única raíz es : " + raizA);
        }else {
            raizA = ((-(this.b)  + Math.sqrt(raizCuadrada) )/ (2 * this.a)) ;
            raizB = ((-(this.b)  - Math.sqrt(raizCuadrada) )/ (2 * this.a)) ;
            return("Las raices son : " + raizA + " y " + raizB);
        }

    }


}
