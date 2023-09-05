package ar.edu.unlu.prog1;

import java.util.Date;

public class Tarea {

    private byte prioridad = 0;
    private boolean hecha = false;
    private Date fecha_limite ;
    private boolean vencida = false;
    private String descripcion = "";

    /*
    atributos:
    Prioridad = byte
    Hecha = boolean
    fecha limite
    vencida = boolean
    descripcion

     */


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha_limite(Date fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public void setHecha(boolean hecha) {
        this.hecha = hecha;
    }

    public void setPrioridad(byte prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isHecha() {
        return hecha;
    }

    public boolean isVencida() {
        return vencida;
    }

    public byte getPrioridad() {
        return prioridad;
    }

    public Date getFecha_limite() {
        return fecha_limite;
    }

    public String getDescripcion() {
        return descripcion;
    }



}
