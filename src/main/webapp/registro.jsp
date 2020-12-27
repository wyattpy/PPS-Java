<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="true" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> PPS </title>
    <link  rel="icon" sizes="152px" href="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" type="image/png" />
    <link rel= "stylesheet" href= "https://drive.google.com/uc?export=view&id=1GqIVYgLDRvI1I1xvaXGKuE1xlq8lcm7r">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">

</head>
<body>
<div align="left">
    <a href="/"><i class="fas fa-home"></i></a>
</div>
<div class="formulariosGrandes">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form action="servAltaClienteCli" method="POST">
        <input name="txtCedula" type="text" placeholder="Cédula de identidad" required >
        <input name="txtPass" type="password" placeholder="Contraseña" required>
        <input name="txtPass2" type="password" placeholder="Repita Contraseña" required>
        <input name="txtNombre" type="text" placeholder="Nombre" required>
        <input name="txtApellido" type="text" placeholder="Apellido" required>
        <input name="txtTel" type="text" placeholder="Teléfono" required>
        <input name="txtDir" type="text" placeholder="Dirección" required>
        <input name="txtCorreo" type="text" placeholder="Correo electronico" required>
        <input type="submit"  value="Crear mi cuenta" name="btnAlta">
    </form>
</div>
<%
    HttpSession sesion = request.getSession();
    if(request.getAttribute("registrodu")!=null){
        out.println("<script>alert('Contraseñas no coinciden');</script>");
    }

    if(request.getAttribute("registrono")!=null){
        out.println("<script>alert('Error al registrar cliente');</script>");
    }

    if(request.getAttribute("registrook")!=null){
        sesion.setAttribute("nombre", request.getAttribute("nombre"));
        sesion.setAttribute("apellido", request.getAttribute("apellido"));
        sesion.setAttribute("cedula",request.getAttribute("cedula"));
        sesion.setAttribute("pass",request.getAttribute("pass"));
        sesion.setAttribute("telefono",request.getAttribute("telefono"));
        sesion.setAttribute("direccion",request.getAttribute("direccion"));
        sesion.setAttribute("correo",request.getAttribute("correo"));

        response.sendRedirect("menu.jsp?wellcome=0");
    }
%>
</body>
</html>