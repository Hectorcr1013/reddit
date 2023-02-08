/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.entidades;

import java.util.List;

/**
 *
 * @author chiqu
 */
public class Comunidad {

    public Comunidad() {
    }

    public Comunidad(String nombre, Usuario usuarios) {
        this.nombre = nombre;
        this.usuarios = usuarios;
    }
    
    /**
     * @return the usuarios
     */
    public Usuario getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(Usuario usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private Usuario usuarios;
    
}
