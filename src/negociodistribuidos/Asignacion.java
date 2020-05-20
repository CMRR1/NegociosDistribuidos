/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negociodistribuidos;

import java.io.Serializable;

/**
 *
 * @author ceccy
 */
public class Asignacion implements Serializable{

    private String nombre,curso,notas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    private int calificacion, id;
    private boolean estado, tipo;
    

    public Asignacion()  {
    }

    public Asignacion(String nombre, int calificacion, int id, boolean estado, boolean tipo,String curso,String notas) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.id = id;
        this.estado = estado;
        this.tipo = tipo;
        this.curso = curso;
        this.notas = notas;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

}
