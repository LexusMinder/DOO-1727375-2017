<%-- 
    Document   : login
    Created on : 20/02/2017, 10:47:46 PM
    Author     : Jose Julio Mancha Hdz 1727375
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <h1>Bienvenido</h1>
        <form action="LoginController" method="POST">
            <label>User:</label>
            <input type="text" name="txt-username" >

            <label>Contraseña:</label>
            <input type="password" name="txt-password">

            <input type="submit" name="iniciarsesion" value="Iniciar sesion">


        </form>
    </body>
</html>