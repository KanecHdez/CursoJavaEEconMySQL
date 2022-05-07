package net.itinajero.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Comentarios extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Recibimos los parametros del formulario.
        String name = request.getParameter("name");
        String perfil = request.getParameter("perfil");
        String id = request.getParameter("id");

        // 2. Aplicamos las reglas de negocio con la informacion del formulario enviada por el usuario.            
        System.out.println("Name: " + name);
        System.out.println("Perfil: " + perfil);
        System.out.println("id: " + id);

        // 3. Siempre regresamos un respuesta al cliente. En este caso un documento HTML.
        if (perfil.equals("admin")) {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Comentarios</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h3>Acceso concedido</h3>");
                out.println("</body>");
                out.println("</html>");
            }
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1. Recibimos los parametros del formulario.

        String nombreParam = request.getParameter("nombre");
        String emailParam = request.getParameter("email");
        String gradoParam = request.getParameter("grado");
        String comentariosParam = request.getParameter("comentarios");
        
        // 2. Aplicamos las reglas de negocio con la informacion del formulario enviada por el usuario.
        System.out.println("Nombre: " + nombreParam);
        System.out.println("Email: " + emailParam);
        System.out.println("Grado: " + gradoParam);
        System.out.println("Comentarios: " + comentariosParam);

        // 3. Siempre regresamos un respuesta al cliente. En este caso un documento HTML.      
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Comentarios</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Gracias por tus comentarios " + nombreParam + "</h3>");
            out.println("<h4>En breve nos comunicaremos contigo.</h4>");
            out.println("</body>");
            out.println("</html>");
        }

    }

}
