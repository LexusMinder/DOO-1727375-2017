<%-- 
    Document   : success
    Created on : 19/03/2017, 04:00:00 PM
    Author     : moust
--%>
<% String color = "";
            Cookie cookie = null;

            Cookie[] cookies = null;

            cookies = request.getCookies(); // Obtiene un arreglo de cookies asociado al dominio
            for (int i = 0; i < cookies.length; i++){
             if(cookies[i].getName().equals("color")){
              cookie = cookies[i];
             color = cookie.getValue(); 
             }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: <%=color%>">

        <form action="ProfileController">
            <h1>Hola, Julio</h1>

            <h3>User: <%= session.getAttribute("username") %></h3> 

            <h3>Nombre: <%= session.getAttribute("nombre") %></h3>

            <h3><label>Color:</label>
                <select name="select">
                    <option name="" value="red">rojo</option>
                    <option name="" value="blue">azul</option>
                    <option name="" value="white">blanco</option>
                    <option name="" value="yellow">amarillo</option>
                </select> 

                <input type="submit" value="Guardar" name="submit">
                <br></br>
            </h3>
            <a href="LogoutController" value="Regresar" >Cerrar Sesion</a>
        </form>
    </body>
</body>
</html>
