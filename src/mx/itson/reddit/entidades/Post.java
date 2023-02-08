/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author chiqu
 */
public class Post {

    public Post() {
    }

    public Post(String titulo, Usuario usuario, String contenido, int puntos, Comentario comentario, Date fecha, Comunidad comunidad) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.contenido = contenido;
        this.puntos = puntos;
        this.comentario = comentario;
        this.fecha = fecha;
        this.comunidad = comunidad;
    }
    
    /**
     * @return the comentario
     */
    public Comentario getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the comunidad
     */
    public Comunidad getComunidad() {
        return comunidad;
    }

    /**
     * @param comunidad the comunidad to set
     */
    public void setComunidad(Comunidad comunidad) {
        this.comunidad = comunidad;
    }
    
    private String titulo;
    private Usuario usuario;
    private String contenido;
    private int puntos;
    private Comentario comentario;
    private Date fecha;
    private Comunidad comunidad;
    
}
