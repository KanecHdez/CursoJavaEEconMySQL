package net.itinajero.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RespuestaJSON extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response type to JSON
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        out.println("{\"employees\":[\n"
                + "    {\"firstName\":\"John\", \"lastName\":\"Doe\"},\n"
                + "    {\"firstName\":\"Anna\", \"lastName\":\"Smith\"},\n"
                + "    {\"firstName\":\"Peter\", \"lastName\":\"Jones\"}\n"
                + "]}");

        /*
         
         {"employees":[
            {"firstName":"John", "lastName":"Doe"},
            {"firstName":"Anna", "lastName":"Smith"},
            {"firstName":"Peter", "lastName":"Jones"}
         ]}
         
         */
    }

}
