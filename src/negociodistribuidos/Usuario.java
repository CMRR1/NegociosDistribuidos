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
public class Usuario implements Serializable{
    protected String usuario, contrasenia;
    protected int id;
    
    public Usuario(){
        
    }

    public Usuario(String usuario, String contrasenia, int id) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.id=id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrasenia=" + contrasenia + ", id=" + id + '}';
    }

    
    
    
}
