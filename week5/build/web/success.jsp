<%-- 
    Document   : success
    Created on : 20/02/2017, 10:48:19 PM
    Author     : Jose Julio Mancha Hernandez 1727375
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesión válido</title>
    </head>
    <body>

        <h1>Inicio de sesión válido</h1>

        <h2>Hola <%= request.getAttribute("username") %></h2>
    </body>
</html>