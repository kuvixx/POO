package ar.edu.unlu.prog1.tp2.ej11;

import ar.edu.unlu.prog1.tp2.ej2.Cliente;
import ar.edu.unlu.prog1.tp2.ej2.Excursion;
import ar.edu.unlu.prog1.tp2.ej2.Hospedaje;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public  static ArrayList<Presupuesto> presupuestos = new ArrayList<Presupuesto>();
    public void cargar_vehiculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("0=Auto pasajeros, 1= Auto pasajeros VIP, 2= Combi, 3= Camioneta flete, 4= Camion");
        int tipo_vehiculo = sc.nextInt();
        while (tipo_vehiculo <0 && tipo_vehiculo>4){
            System.out.println("Valor incorrecto");
            tipo_vehiculo = sc.nextInt();
        }

        if (tipo_vehiculo == 0){
            Auto_pasajeros vehiculo = new Auto_pasajeros();
            System.out.println("ingrese asientos del vehiculo");
            vehiculo.setAsientos(sc.nextInt());
            System.out.println("ingrese patente del vehiculo");
            boolean patentevalida = false;
            String patente = sc.next();
            if (!validar_patente(patente)) {
                while (patentevalida) {
                    patentevalida = validar_patente(patente);
                }
            }
            vehiculo.setPatente(patente);
            vehiculos.add(vehiculo);
        } else if (tipo_vehiculo == 1) {
            Auto_pasajeros_VIP vehiculo = new Auto_pasajeros_VIP();
            System.out.println("ingrese asientos del vehiculo");
            vehiculo.setAsientos(sc.nextInt());
            boolean patentevalida = false;
            String patente = sc.next();
            if (!validar_patente(patente)) {
                while (patentevalida) {
                    patentevalida = validar_patente(patente);
                }
            }
            vehiculo.setPatente(patente);
            vehiculos.add(vehiculo);
        } else if (tipo_vehiculo == 2) {
            Combi vehiculo = new Combi();
            boolean patentevalida = false;
            String patente = sc.next();
            if (!validar_patente(patente)) {
                while (patentevalida) {
                    patentevalida = validar_patente(patente);
                }
            }
            vehiculo.setPatente(patente);
            vehiculos.add(vehiculo);
        } else if (tipo_vehiculo == 3) {
            Camioneta_flete vehiculo = new Camioneta_flete();
            System.out.println("ingrese peso autorizado total del vehiculo");
            vehiculo.setPeso_autorizado_total(sc.nextDouble());
            boolean patentevalida = false;
            String patente = sc.next();
            if (!validar_patente(patente)) {
                while (patentevalida) {
                    patentevalida = validar_patente(patente);
                }
            }
            vehiculo.setPatente(patente);
            vehiculos.add(vehiculo);
        } else  {
             Camion vehiculo = new Camion();
            boolean patentevalida = false;
            String patente = sc.next();
            if (!validar_patente(patente)) {
                while (patentevalida) {
                    patentevalida = validar_patente(patente);
                }
            }
            vehiculo.setPatente(patente);
            vehiculos.add(vehiculo);
        }


    }
    public boolean validar_patente(String patente){
        for (int i= 0; i < vehiculos.size() ; i ++){
            if (patente.equals(vehiculos.get(i).getPatente())){
                System.out.println("Ya existe un vehiculo con esa patente");
                return false;
            }
        }
        return true;

    }

    public void emitir_presupuesto(ar.edu.unlu.prog1.tp2.ej11.Cliente cliente, Vehiculo vehiculo){
        Scanner sc = new Scanner(System.in);
        System.out.println("indique cantidad de dias a alquilar el vehiculo");
        int dias = sc.nextInt();
        Presupuesto presupuesto = new Presupuesto(vehiculo, dias, cliente);
        System.out.println("El monto final es: "+ presupuesto.getMonto_final());
        presupuestos.add(presupuesto);

    }
    public void generar_alquiler(Presupuesto presupuesto){
        presupuesto.aprobar();
        presupuesto.getVehiculo().alquilar();
    }

    public void monto_total_alquileres_cliente(Cliente cliente){
        double acum = 0.0;
        for (int i= 0; i < presupuestos.size() ; i ++){
            Presupuesto presupuesto = presupuestos.get(i);
            if (presupuesto.getCliente().equals(cliente) && presupuesto.getAprobado()){
                acum = acum + presupuesto.getMonto_final();
            }
        }
        System.out.println("El cliente gastó en nosotros: $"+ acum);
    }

    public void monto_total_alquileres(){
        double acum = 0.0;
        for (int i= 0; i < presupuestos.size() ; i ++){
            Presupuesto presupuesto = presupuestos.get(i);
            if (presupuesto.getAprobado()){
                acum = acum + presupuesto.getMonto_final();
            }
        }
        System.out.println("El monto total de alquileres son: $"+ acum);
        }


}
