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
public class Maestro extends Usuario {

    private String nombre;
    private Usuario contrasenia, usuario;

    public Maestro() {
    }

    public Maestro(String nombre, String usuario, String contrasenia) {
        super(usuario, contrasenia);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasenia(Usuario contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Maestro{" + "nombre=" + nombre + ", contrasenia=" + contrasenia + ", usuario=" + usuario + '}';
    }

}
