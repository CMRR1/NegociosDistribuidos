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
public class Calificacion implements Serializable
{

    private int num, id, tareas;
    private String curso;

    public Calificacion() {
    }

    public Calificacion(int num, int id, int tareas, String curso) {
        this.num = num;
        this.id = id;
        this.tareas = tareas;
        this.curso = curso;
    }

    public int getTareas() {
        return tareas;
    }

    public void setTareas(int tareas) {
        this.tareas = tareas;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
