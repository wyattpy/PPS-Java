<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("nombre")==null){
        response.sendRedirect("acceso.jsp?fake=true");
    }
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> PPS - Login </title>
    <link  rel="icon" sizes="152px" href="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" type="image/png" />
    <link rel= "stylesheet" href= "https://drive.google.com/uc?export=view&id=1GqIVYgLDRvI1I1xvaXGKuE1xlq8lcm7r">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">
</head>
<body>
<div align="left">
    <a href="menu.jsp"><i class="fas fa-home"></i></a>
</div>
<div class="formulariosGrandes">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form action="servActualizameCli" method="post">
        <label>
            <input name="txtCedula" value="<%=sesion.getAttribute("cedula")%>" type="text" readonly>
            <input name="txtContrasena" value="<%=sesion.getAttribute("pass")%>" type="text" required>
            <input name="txtNombre" value="<%=sesion.getAttribute("nombre")%>" type="text" readonly>
            <input name="txtApellido" value="<%=sesion.getAttribute("apellido")%>" type="text" readonly>
            <input name="txtTel" value="<%=sesion.getAttribute("telefono")%>" type="text" required>
            <input name="txtDir" value="<%=sesion.getAttribute("direccion")%>" type="text" required>
            <input name="txtCorreo" value="<%=sesion.getAttribute("correo")%>" type="text" required>
            <input type="submit"  value="Modificar" name="btnMod">
        </label>
    </form>
</div
<%
    if(request.getAttribute("modok")!=null){
        response.sendRedirect("acceso.jsp?modok=true");
    }
    if(request.getAttribute("modno")!=null){
        out.println("<script>alert('No se pudo modificar');</script>");
    }
%>
</body>
</html>