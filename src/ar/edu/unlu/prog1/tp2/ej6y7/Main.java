package ar.edu.unlu.prog1.tp2.ej6y7;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Venta> ventas = new ArrayList<Venta>();
    public static ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public static ArrayList<Expendedor> clases = new ArrayList<Expendedor>();

    public static void main(String Args[]){

    }

    public ArrayList<Cliente> informetop10clientes(){
        ArrayList<Cliente> topgastadores = new ArrayList<Cliente>();

        for (int i= 0; i < clientes.size() ; i ++){
            Cliente cliente = clientes.get(i);
            float acum = 0;
            for (int j= 0; j < ventas.size() ; j ++){
                if (ventas.get(j).getCliente().equals(cliente)){
                    acum = acum + ventas.get(j).getImporteTotal();
                }
            }

        }

        return topgastadores;
    }

    public void informeVentasXCombustible(){}

    public void informeVentasXSurtidor(){}

    public void informeVentasXEmpleado(){}

    public void informelitrosXSurtidor(){}
}
