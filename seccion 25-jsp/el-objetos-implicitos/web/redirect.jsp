<%
   // aqui podria ir cualquier c�digo java valido....
   // Incluso conexiones a base de datos para generar c�digo HTML m�s din�mico...
  
   // Recibimos el parametro enviado por el formulario HTML...
   String name=request.getParameter("uname");  
   
   //Hacemos algo con los datos del formulario. Lo podriamos guardar en una BD
   System.out.println("Nombre enviado por el usuario: " + name);
   
   // Redireccionamos al usuario a otro JSP en este mismo directorio...   
   response.sendRedirect("notificacion.jsp");
   
   // Incluso podriamos hacer una redireccion a una URL externa...
   //response.sendRedirect("http://www.amazon.com");
%>  