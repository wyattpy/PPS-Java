<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="true" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> PPS </title>
    <link  rel="icon" sizes="152px" href="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" type="image/png" />
    <link rel= "stylesheet" href= "https://drive.google.com/uc?export=view&id=1GqIVYgLDRvI1I1xvaXGKuE1xlq8lcm7r">

</head>
<body>
<div align="left">
    <a href="/"><img src="https://drive.google.com/uc?export=view&id=1iRAvXNx0rHtzogPV-wwucx72YVdbX7jD" width="50" height="50"></a>
</div>
<div class="contenedor-form">
    <div class="toggle">
        <span>Registrese Aqui</span>
    </div>
    <div class="formulario">
        <h2>Iniciar Sesión</h2>
        <form action="servLoginCliente" method="POST">
            <input name="txtCedula" type="txtCedula" placeholder="Cedula" required>
            <input name="txtPass" type="txtPass" placeholder="Contraseña" required>
            <input type="submit" value="Iniciar Sesión" name="btnLogin">
        </form>
    </div>
    <div class="formulario">
        <h2>Crea tu cuenta</h2>
        <form action="servAltaClienteCli" method="POST">
            <input name="txtCedula" type="text" placeholder="Cédula de identidad" required >
            <input name="txtPass" type="password" placeholder="Contraseña" required>
            <input name="txtPass2" type="password" placeholder="Repita Contraseña" required>
            <input name="txtNombre" type="text" placeholder="Nombre" required>
            <input name="txtApellido" type="text" placeholder="Apellido" required>
            <input name="txtTel" type="text" placeholder="Teléfono" required>
            <input name="txtDir" type="text" placeholder="Dirección" required>
            <input name="txtCorreo" type="email" placeholder="Correo electronico" required>
            <p>Al crear la cuenta usted acepta los <a href="terminosycondociones.html"> terminos y condiciones</a></p>
            <input type="submit"  value="Crear mi cuenta" name="btnAlta">
        </form>
    </div>
</div>
<script src="https://drive.google.com/uc?export=view&id=1Q8RX4zhEuF5DCA2tX9sOmDjrIP5Y_rhc"></script>
<script src="https://drive.google.com/uc?export=view&id=1gKxmxwLhdJpyZCuW8n24RE2DJ8_t1t3Q"></script>
<%
    HttpSession sesion = request.getSession();
    String nombre;
    if(request.getAttribute("nombre")!=null){
        nombre = (String) request.getAttribute("nivel");
        if(!nombre.equals(null)){
            sesion.setAttribute("nombre", request.getAttribute("nombre"));
            sesion.setAttribute("apellido", request.getAttribute("apellido"));
            sesion.setAttribute("cuenta", request.getAttribute("cuenta"));
            response.sendRedirect("menu.jsp");
        }
        else{
            out.println("<script>alert('Usuario o contraseña incorrecta, verifique sus credenciales');</script>");
        }
    }
    if(request.getParameter("cerrar")!=null){
        request.getSession().invalidate();
    }
%>
</body>
</html>