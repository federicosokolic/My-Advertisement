<%--
  Created by IntelliJ IDEA.
  User: raulgpena
  Date: 2019-03-11
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
        <style>
            html, body { height:100%; }

            .outer-wrapper {
                display: table;
                width: 100%;
                height: 100%;
            }

            .inner-wrapper {
                display:table-cell;
                vertical-align:middle;
                padding:15px;
            }
            .login-btn { position:fixed; top:15px; right:15px; }
        </style>

        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    </head>
    <body>

        <section id="loginform" class="outer-wrapper">

            <div class="inner-wrapper">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-4 col-sm-offset-4">
                            <h2 class="text-center">Registro de Usuarios.</h2>
                            <br>
                            <form method="post" action="registro" role="form">
                                <div class="form-group">
                                    <label for="nombre">Nombre</label>
                                    <input  class="form-control" id="nombre" name="nombre" placeholder="Nombre">
                                </div>
                                <div class="form-group">
                                    <label for="apellido">Apellido</label>
                                    <input  class="form-control" id="apellido" name="apellido" placeholder="Apellido">
                                </div>
                                <div class="form-group">
                                    <label for="email">E-mail</label>
                                    <input type="email" class="form-control" id="email" name="email" placeholder="E-mail">
                                </div>
                                <div class="form-group">
                                    <label for="usuario">Usuario</label>
                                    <input  class="form-control" id="usuario" name="usuario" placeholder="Usuario">
                                </div>    
                                <div class="form-group">
                                    <label for="password">contrasenia</label>
                                    <input type="password" class="form-control" id="contrasenia" name="contrasenia" placeholder="Contraseña">
                                </div> 

                                <br>

                                <button type="submit" class="btn btn-default">Registrar</button>
                            </form>
                        </div>
                        <%if (request.getParameter("userok") != null &&
                      request.getParameter("userok").equals("1000")) {%>
                        <h3>Registro Realizado</h3>
                        <%}%>
                    </div>
                </div>
            </div>

        </section>
    </body>
</html>
