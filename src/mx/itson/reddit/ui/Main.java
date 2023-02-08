/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import mx.itson.reddit.entidades.*;

/**
 *
 * @author chiqu
 */
public class Main {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        
        //Datos usuarios
        Usuario u = new Usuario("PepitoDestroyer05", 580, "pepitodes05@hotmail.com", "Pepitoelmejor", "Mexico");
        
        Usuario u2 = new Usuario("Robertito87", 702, "robertocarlos87@hotmail.com", "password", "Peru");
        
        Usuario u3 = new Usuario("PablitoElDelClavito", 920, "clavito2035@hotmail.com", "contrasena", "Mexico");
        
        Usuario u4 = new Usuario("eltortas48");
        Usuario u5 = new Usuario("joseelpro");
        Usuario u6 = new Usuario("NiteMex");
        Usuario u7 = new Usuario("Juicy");
        Usuario u8 = new Usuario("Dilly_Dally");
        Usuario u9 = new Usuario("Peep");
        Usuario u10 = new Usuario("Gordo");
        Usuario u11 = new Usuario("Chilli");
        Usuario u12 = new Usuario("Boo_Boo");
        Usuario u13 = new Usuario("First_Mate");
        Usuario u14 = new Usuario("Pickle");
        Usuario u15 = new Usuario("LuisGamer");
        
        //Datos comunidad
        Comunidad c = new Comunidad("buildapc", u);
        
        Comunidad c2 = new Comunidad("programacion", u2);
        
        Comunidad c3 = new Comunidad("hoyaprendi", u3);
        
        //Datos comentario
        
        Comentario com1 = new Comentario(u4, "Lo he estado usando durante medio anio y ha sido genial."
                + " La mayoria de las quejas que tuve se solucionaron con actualizaciones"
                + " y no he encontrado ningún problema importante.", 23);
        
        Comentario com2 = new Comentario(u5, "Primero que nada yo te diria que te hicieras"
                + "la pregunta de hacia donde te quisieras encaminar en este "
                + "mundo de la programacion y a partir de ahi haces una ruta "
                + "de programacion, pero para empezar yo te recomendaria Python", 68 );
        
        Comentario com3 = new Comentario(u6, "WhatsApp Business", 5);
        
        Comentario com4 = new Comentario(u7, "Por ahora siento que si es buena opcion instalarlo "
                + "al principio siento que es cuando fallaba pero ahora no me falla nada", 19);
        
        Comentario com5 = new Comentario(u8, "Ya va bien", 16);
        
        Comentario com6 = new Comentario(u9, "Yo recien lo instale llevo una semana y no me ha fallado", 3);
        
        Comentario com7 = new Comentario(u10, "Python es de los mas generales y es facil de entender gracias a su sintaxis", 53);
        
        Comentario com9 = new Comentario(u11, "Entre Java y Pyhton son de los que te recomendaria para empezar", 43);
        
        Comentario com10 = new Comentario(u12, "Si quieres dedicarte al desarrollo web empieza por html, css, js y ve descubriendo frameworks", 80);
        
        Comentario com11 = new Comentario(u13, "Podrias programar uno pero eso ya sería más avanzado puedes empezar configurando en whatsapp business", 19);
        
        Comentario com12 = new Comentario(u14, "En tutoriales de youtube puedes encontrar muchos diferentes", 16);
        
        Comentario com8 = new Comentario(u15, "Depende para lo que necesites hay una variedad:) escribeme y te ayudo", 12);
        
        //Datos Post
        Date fecha = formato.parse("2022/09/24");
        Post p = new Post("Deberia instalar Windows 11?", u, "He visto eso para actualizar a Windows 11 y es "
                + "muy tentador, pero me han dicho que tiene errores "
                + "y tiene un mal rendimiento, me pueden orientar?", 241, com1, fecha, c);
        
        Date fecha2 = formato.parse("2022/05/28");
        Post p2 = new Post("Que lenguaje deberia de aprender primero?", u2, "Acabo de empezar en este mundo de la programacion"
                + "y no se que lenguaje empezar a estudiar primero, que me recomiendan?", 455, com2, fecha2, c2);
        
        Date fecha3 = formato.parse("2022/06/20");
        Post p3 = new Post("Necesito recomendaciones de bots para comunicarme por whatsapp"
                + " para los clientes de mi empresa.", u3, "Alguien me recomendaría un buen Bot de whatsapp que "
                + "le permita a los clientes de mi empresa comunicarse con la persona adecuada?", 16, com3, fecha3, c3);
        
        //Mostrado en consola
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("      "+"r/" + c.getNombre() + "    *Publicado por u/" + u.getNombre()+" " + p.getFecha() +"   "+ u.getPais());
        System.out.println("  "+p.getPuntos()+"    ");
        System.out.println("      "+p.getTitulo() + "\n");
        System.out.println("      "+p.getContenido() + "\n");
        System.out.println("                "+com1.getUsuario().getNombre()+ "      Hace 1mes");
        System.out.println("             "+com1.getPuntos());
        System.out.println("                " + com1.getCuerpo());
        System.out.println("\n");
        System.out.println("                "+com4.getUsuario().getNombre()+ "      Hace 3sem");
        System.out.println("             "+com4.getPuntos());
        System.out.println("                " + com4.getCuerpo());
        System.out.println("\n");
        System.out.println("                "+com5.getUsuario().getNombre()+ "      Hace 2sem");
        System.out.println("             "+com5.getPuntos());
        System.out.println("                " + com5.getCuerpo());
        System.out.println("\n");
        System.out.println("                "+com6.getUsuario().getNombre()+ "      Hace 3d");
        System.out.println("             "+com6.getPuntos());
        System.out.println("                " + com6.getCuerpo());
        System.out.println("-----------------------------------------------------------------------------------------------------\n");
        
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("      "+"r/" + c2.getNombre() + "    *Publicado por u/" + u2.getNombre()+ " " + p2.getFecha() +"   "+ u2.getPais());
        System.out.println("  "+p2.getPuntos()+"    ");
        System.out.println("      "+p2.getTitulo() + "\n");
        System.out.println("      "+p2.getContenido() + "\n");
        System.out.println("                "+com2.getUsuario().getNombre()+ "      Hace 1mes");
        System.out.println("             "+com2.getPuntos());
        System.out.println("                " + com2.getCuerpo());
        System.out.println("\n");
        System.out.println("                "+com7.getUsuario().getNombre()+ "      Hace 1mes");
        System.out.println("             "+com7.getPuntos());
        System.out.println("                " + com7.getCuerpo());
        System.out.println("\n");
        System.out.println("                "+com8.getUsuario().getNombre()+ "      Hace 3sem");
        System.out.println("             "+com8.getPuntos());
        System.out.println("                " + com8.getCuerpo());
        System.out.println("\n");
        System.out.println("                "+com9.getUsuario().getNombre()+ "      Hace 6d");
        System.out.println("             "+com9.getPuntos());
        System.out.println("                " + com9.getCuerpo());
        System.out.println("-----------------------------------------------------------------------------------------------------\n");
    
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("      "+"r/" + c3.getNombre() + "    *Publicado por u/" + u3.getNombre()+ " " + p3.getFecha() +"   "+ u3.getPais());
        System.out.println("  "+p3.getPuntos()+"    ");
        System.out.println("      "+p3.getTitulo() + "\n");
        System.out.println("      "+p3.getContenido() + "\n");
        System.out.println("                "+com3.getUsuario().getNombre()+ "      Hace 2mes");
        System.out.println("             "+com3.getPuntos());
        System.out.println("                " + com3.getCuerpo());
        System.out.println("\n");
        System.out.println("                "+com10.getUsuario().getNombre()+ "      Hace 1mes");
        System.out.println("             "+com10.getPuntos());
        System.out.println("                " + com10.getCuerpo());
        System.out.println("\n");
        System.out.println("                "+com11.getUsuario().getNombre()+ "      Hace 3sem");
        System.out.println("             "+com11.getPuntos());
        System.out.println("                " + com11.getCuerpo());
        System.out.println("\n");
        System.out.println("                "+com12.getUsuario().getNombre()+ "      Hace 1sem");
        System.out.println("             "+com12.getPuntos());
        System.out.println("                " + com12.getCuerpo());
        System.out.println("-----------------------------------------------------------------------------------------------------\n");
    
    }
    
}
