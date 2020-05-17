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
public class Alumno extends Usuario{
    
    private String nombre, apellidoM, apellidoP;
    Usuario usuario, contrasenia;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidoM, String apellidoP, String usuario, String contrasenia) {
        super(usuario, contrasenia);
        this.nombre = nombre;
        this.apellidoM = apellidoM;
        this.apellidoP = apellidoP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public void setContrasenia(Usuario contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidoM=" + apellidoM + ", apellidoP=" + apellidoP + ", usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }


    
    
    
}
