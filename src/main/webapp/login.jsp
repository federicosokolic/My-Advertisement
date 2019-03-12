<%-- 
    Document   : login
    Created on : 11/03/2019, 19:54:41
    Author     : EducaciónIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="login" method="post">
            E-mail:<br>
            <input type="text" id="email" name="email">
            <br>
            Contraseña:<br>
            <input type="password" id="pass" name="pass">
            <br><br>
            <input type="submit" value="ingresar">
        </form> 
    </body>
</html>
