<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
   <head>
      <title>Login</title>
      <meta charset="UTF-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
   <body>
      <!-- 1. Enviamos datos (peticion POST)-->
      <form action="login" method="post">  
         Name:<input type="text" name="name"><br>  
         Password:<input type="password" name="password"><br>  
         <input type="submit" value="login">  
      </form>  
   </body>
</html>
