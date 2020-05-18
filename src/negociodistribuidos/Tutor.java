/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negociodistribuidos;

/**
 *
 * @author ceccy
 */
public class Tutor extends Usuario {
    private String nombre;
    private Alumno alumno;

    public Tutor() {
    }

    public Tutor(String nombre, String usuario, String contrasenia,int id ,Alumno alumno) {
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

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }



    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    


    
    
    
}
