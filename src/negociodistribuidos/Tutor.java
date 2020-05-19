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
public class Tutor extends Usuario implements Serializable{
    private String nombre;
    private int alumno;

    public Tutor() {
    }

    public Tutor(String nombre, String usuario, String contrasenia,int id ,int alumno) {
        super(usuario, contrasenia,id);
        this.nombre = nombre;
        this.alumno=alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAlumno() {
        return alumno;
    }

    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }

    @Override
    public String getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String getContrasenia() {
        return contrasenia;
    }

    @Override
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tutor{" + "nombre=" + nombre + ", alumno=" + alumno + '}';
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    


    
    
    
}
