<%-- 
    Document   : register
    Created on : 18/03/2017, 12:51:50 AM
    Author     : moust
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form action="RegisterController" method="POST">
            <div>    
                <label>Nombre: <input type="text" name="nombre" value=""></label>
                <br></br>
                <label>Apellidos: <input type="text" value="" name="apellidos"></label>
                <br></br>
                <label>Usuario: <input name="user" type="text" value=""></label>
                <br></br>
                <label>Password: <input name="password" type="password"value=""></label>
                <br></br>
                <input type="submit" value="Registrar" name="Registrar">
            </div>
        </form>
    </body>
</html>
