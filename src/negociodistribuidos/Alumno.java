/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negociodistribuidos;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ceccy
 */
public class Alumno implements Serializable{

    private String nombre;
    private ArrayList<Asignacion> asignaciones, trabajos;
    private ArrayList<Calificacion> calificaciones;
    private int id;

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Asignacion> asignaciones, ArrayList<Asignacion> trabajos, ArrayList<Calificacion> calificaciones, int id) {
        this.nombre = nombre;
        this.asignaciones = asignaciones;
        this.trabajos = trabajos;
        this.calificaciones = calificaciones;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ArrayList<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    public ArrayList<Asignacion> getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(ArrayList<Asignacion> trabajos) {
        this.trabajos = trabajos;
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaciones=" + asignaciones + ", trabajos=" + trabajos + ", calificaciones=" + calificaciones + ", id=" + id + '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
