/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negociodistribuidos;

import java.util.ArrayList;

/**
 *
 * @author ceccy
 */
public class Curso {

    private String nombre;
    private Maestro maestro;
    private int id;
    private ArrayList<Alumno> alumnos;

    public Curso() {
    }

    public Curso(String nombre, Maestro maestro, int id, ArrayList<Alumno> alumnos) {
        this.nombre = nombre;
        this.maestro = maestro;
        this.id = id;
        this.alumnos = alumnos;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(Maestro maestro) {
        this.maestro = maestro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombre=" + nombre + ", maestro=" + maestro + ", id=" + id + '}';
    }

}
