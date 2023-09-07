package ar.edu.unlu.prog1.tp1.eje5_10_12_13;

import java.time.LocalDate;
import java.util.Date;

public class Tarea {

    private byte prioridad = 0;
    private boolean hecha = false;
    private LocalDate fecha_limite ;
    private LocalDate fecha_recordatorio;
    private LocalDate fecha_finalizacion;
    private String colaborador;
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

    public void setFecha_limite(LocalDate fecha_limite) {
        this.fecha_limite = fecha_limite;
    }

    public void setHecha(boolean hecha) {
        this.hecha = hecha;
    }

    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }

    public void setPrioridad(byte prioridad) {
        this.prioridad = prioridad;
    }

    public void setFecha_recordatorio(LocalDate fecha_recordatorio) {
        this.fecha_recordatorio = fecha_recordatorio;
    }

    public void setFecha_finalizacion(LocalDate fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }

    public String getColaborador() {
        return colaborador;
    }

    public LocalDate getFecha_finalizacion() {
        return fecha_finalizacion;
    }

    public LocalDate getFecha_recordatorio() {
        return fecha_recordatorio;
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

    public LocalDate getFecha_limite() {
        return fecha_limite;
    }

    public String getDescripcion() {
        return descripcion;
    }



}
