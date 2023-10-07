package ar.edu.unlu.prog1.tp2.ej1;

import java.time.LocalDate;
import java.util.Scanner;

public class Credencial {
    private Socios socio;
    private Suscripcion tipo_suscripcion;

    public void alta_credencial(){
        Scanner sc = new Scanner(System.in);

        Socios socio = new Socios();
        System.out.println("Ingrese nombre y apellido del socio");
        socio.setNombre_ape(sc.next());
        System.out.println("Ingrese DNI");
        socio.setDni(sc.next());
        System.out.println("Ingrese dirección");
        socio.setDireccion(sc.next());
        System.out.println("Ingrese mail");
        socio.setMail(sc.next());
        System.out.println("Ingrese Telefono");
        socio.setTelefono(sc.next());
        socio.setFecha_inscripcion(LocalDate.now());
        this.socio = socio;
        System.out.println("Ingrese tipo de suscripción: 0= basica ; 1= intermedia ; 2= destacada");
        int tiposus = sc.nextInt();
        while (tiposus > 2 || tiposus <0){
            System.out.println("El valor ingresado no es correcto. Valores:  0= basica ; 1= intermedia ; 2= destacada");
            tiposus = sc.nextInt();
        }
        this.tipo_suscripcion.setSuscripcion(tiposus);

    }

    public void modificar_suscripcion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tipo de suscripción: 0= basica ; 1= intermedia ; 2= destacada");
        int tiposus = sc.nextInt();
        while (tiposus > 2 || tiposus <0){
            System.out.println("El valor ingresado no es correcto. Valores:  0= basica ; 1= intermedia ; 2= destacada");
            tiposus = sc.nextInt();
        }
        this.tipo_suscripcion.setSuscripcion(tiposus);
        System.out.println("suscripcion modificada");

    }

    public Suscripcion getTipo_suscripcion() {
        return tipo_suscripcion;
    }

    public Socios getSocio() {
        return socio;
    }
}
