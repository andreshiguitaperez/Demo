<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 12/10/2019
  Time: 4:19 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>Registro</h1>

<form action="/registrar" method="post">
    Correo:
    <input type="text" name="correo"/><br/>
    Contraseña:
    <input type="password" name="contrasena"/><br/>
    Nombre:
    <input type="text" name="nombre"/><br/>
    Apellido:
    <input type="text" name="apellido"/><br/>
    Edad:
    <input type="text" name="edad"/><br/>/registrar

    <input type="submit" value="Registrarse"/>

</form>

</body>
</html>
