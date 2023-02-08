/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.ui;

import java.util.Date;
import mx.itson.reddit.entidades.*;

/**
 *
 * @author chiqu
 */
public class Main {
    
    public static void main(String[] args) {
        
        Usuario u = new Usuario();
        Usuario u2 = new Usuario();
        Usuario u3 = new Usuario();
        Usuario u4 = new Usuario();
        Usuario u5 = new Usuario();
        Usuario u6 = new Usuario();
        
        Comunidad c = new Comunidad();
        Comunidad c2 = new Comunidad();
        Comunidad c3 = new Comunidad();
        
        Comentario comentario = new Comentario();
        Comentario comentario2 = new Comentario();
        Comentario comentario3 = new Comentario();
        
        Post p = new Post();
        Post p2 = new Post();
        Post p3 = new Post();
        
        //Datos usuarios
        u.setNombre("PepitoDestroyer05");
        u.setPais("Mexico");
        u.setKarma(580);
        u.setCorreo("pepitodes05@hotmail.com");
        u.setPassword("Pepitoelmejor");
        
        u2.setNombre("Robertito87");
        u2.setPais("Peru");
        u2.setKarma(702);
        u2.setCorreo("robertocarlos87@hotmail.com");
        u2.setPassword("password");
        
        u3.setNombre("PablitoElDelClavito");
        u3.setPais("Mexico");
        u3.setKarma(920);
        u3.setCorreo("clavito2035@hotmail.com");
        u3.setPassword("contrasena");
        
        u4.setNombre("eltortas48");
        u5.setNombre("joseelpro");
        u6.setNombre("NiteMex");
        
        //Datos comunidad
        c.setNombre("buildapc");
        c.setUsuarios(u);
        
        c2.setNombre("programacion");
        c2.setUsuarios(u2);
        
        c3.setNombre("hoyaprendi");
        c3.setUsuarios(u3);
        
        //Datos comentario
        comentario.setUsuario(u4);
        comentario.setPublicacion(p);
        comentario.setPuntos(23);
        comentario.setCuerpo("Lo he estado usando durante medio anio y ha sido genial."
                + " La mayoría de las quejas que tuve se solucionaron con actualizaciones"
                + " y no he encontrado ningún problema importante.");
        
        comentario2.setUsuario(u5);
        comentario2.setPublicacion(p2);
        comentario2.setPuntos(68);
        comentario2.setCuerpo("Primero que nada yo te diria que te hicieras"
                + "la pregunta de hacia donde te quisieras encaminar en este "
                + "mundo de la programacion y a partir de ahi haces una ruta "
                + "de programacion, pero para empezar yo te recomendaria Python");
        
        comentario3.setUsuario(u6);
        comentario3.setPublicacion(p3);
        comentario3.setPuntos(5);
        comentario3.setCuerpo("WhatsApp Business");
        
        //Datos Post
        p.setTitulo("Deberia instalar Windows 11?");
        p.setContenido("He visto eso para actualizar a Windows 11 y es "
                + "muy tentador, pero me han dicho que tiene errores "
                + "y tiene un mal rendimiento, me pueden orientar?");
        p.setUsuario(u);
        Date fecha = new Date(2023,02,12,18,23);
        p.setFecha(fecha);
        p.setComunidad(c);
        p.setPuntos(241);
        p.setComentario(comentario);
        
        p2.setTitulo("Que lenguaje deberia de aprender primero?");
        p2.setContenido("Acabo de empezar en este mundo de la programacion"
                + "y no se que lenguaje empezar a estudiar primero, que me recomiendan?");
        p2.setUsuario(u2);
        Date fecha2 = new Date(2022,07,16,14,12);
        p2.setFecha(fecha2);
        p2.setComunidad(c2);
        p2.setPuntos(455);
        p2.setComentario(comentario2);
        
        p3.setTitulo("Necesito recomendaciones de bots para comunicarme por whatsapp"
                + " para los clientes de mi empresa.");
        p3.setContenido("Alguien me recomendaría un buen Bot de whatsapp que "
                + "le permita a los clientes de mi empresa comunicarse con la persona adecuada?");
        p3.setUsuario(u3);
        Date fecha3 = new Date(2022,11,26,20,28);
        p3.setFecha(fecha3);
        p3.setComunidad(c3);
        p3.setPuntos(16);
        p3.setComentario(comentario3);
        
        
        //Mostrado en consola
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("      "+"r/" + c.getNombre() + "    *Publicado por u/" + u.getNombre() + p.getFecha() +"   "+ u.getPais());
        System.out.println("  "+p.getPuntos()+"    ");
        System.out.println("      "+p.getTitulo() + "\n");
        System.out.println("      "+p.getContenido() + "\n");
        System.out.println("                "+comentario.getUsuario().getNombre());
        System.out.println("             "+comentario.getPuntos());
        System.out.println("                " + comentario.getCuerpo());
        System.out.println("-----------------------------------------------------------------------------------------------------\n");
        
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("      "+"r/" + c2.getNombre() + "    *Publicado por u/" + u2.getNombre() + p2.getFecha() +"   "+ u2.getPais());
        System.out.println("  "+p2.getPuntos()+"    ");
        System.out.println("      "+p2.getTitulo() + "\n");
        System.out.println("      "+p2.getContenido() + "\n");
        System.out.println("                "+comentario2.getUsuario().getNombre());
        System.out.println("             "+comentario2.getPuntos());
        System.out.println("                " + comentario2.getCuerpo());
        System.out.println("-----------------------------------------------------------------------------------------------------\n");
    
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("      "+"r/" + c3.getNombre() + "    *Publicado por u/" + u3.getNombre() + p3.getFecha() +"   "+ u3.getPais());
        System.out.println("  "+p3.getPuntos()+"    ");
        System.out.println("      "+p3.getTitulo() + "\n");
        System.out.println("      "+p3.getContenido() + "\n");
        System.out.println("                "+comentario3.getUsuario().getNombre());
        System.out.println("             "+comentario3.getPuntos());
        System.out.println("                " + comentario3.getCuerpo());
        System.out.println("-----------------------------------------------------------------------------------------------------\n");
    
    }
    
}
