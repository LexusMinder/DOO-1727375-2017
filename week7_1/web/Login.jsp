<%-- 
    Document   : register
    Created on : 18/03/2017, 12:51:50 AM
    Author     : moust
--%>

<%
    String username = "";
    if (session.getAttribute("username") != null) {
        response.sendRedirect("profile.jsp");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tarea_7</title>
    </head>
    <body>
        <h1>Incio de sesion</h1>
        <form action="LoginController" Method="POST">
            <label>Usuario: <input name="user" type="text" value=""></label>
            <label>Password: <input name="password" type="password"value=""></label>
            <br></br>
            <input type="submit" value="Inciar Sesion" name="Inciar Sesion">
            o
            <a href="register.jsp" value="" >Registrar</a>
        </form>
    </body>
</html>
