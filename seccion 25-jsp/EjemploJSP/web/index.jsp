<%-- 
    Document   : index
    Created on : Apr 21, 2016, 10:26:23 AM
    Author     : ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<%-- 
  Página HTML para mostrar el catálogo de productos
--%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mi primer JSP</title>
  </head>
  <body>
    <h1>Ejemplo Scriplets</h1>
    <%
       String titulo = "Lista de productos";
       List<String> catalogo = new ArrayList();
       catalogo.add("Laptop");
       catalogo.add("Impresora");
       catalogo.add("Escaner");
    %>
    <h2><%=titulo%></h2>
    <select name="producto" multiple>
    <%
      for (String producto : catalogo){ 
        out.print("<option>"+producto+"</option>");
      }
    %>
    </select>
  </body>
</html>
