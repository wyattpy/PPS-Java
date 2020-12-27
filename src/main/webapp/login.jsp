<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="true" %>
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
    <a href="/"><i class="fas fa-home"></i></a>
</div>
<div class="login">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form action="servLoginUser" method="post">
        <input type="text" name="txtCedula" placeholder="Cedula de Identidad" id="username">
        <input type="password" name="txtPass" placeholder="Contraseña" id="password">
        <input type="submit"  value="Acceder" name="btnLogin">
    </form>
</div>
<%
    HttpSession sesion = request.getSession();
    int nivel = 0;
    if(request.getAttribute("nivel")!=null){
        nivel = (Integer) request.getAttribute("nivel");
        if(nivel == 1){
            sesion.setAttribute("nombre", request.getAttribute("nombre"));
            sesion.setAttribute("nivel", 1);
            response.sendRedirect("home.jsp");
        }
        else{
            out.println("<script>alert('Usuario o contraseña incorrecta, verifique sus credenciales');</script>");
        }
    }
    if(request.getParameter("endsession")!=null){
        sesion.invalidate();
    }
    if(request.getParameter("fake")!=null){
        out.println("<script>alert('Error. No has accedido al sistema...');</script>");
    }
    if(request.getParameter("Passchange")!=null){
        out.println("<script>alert('Contraseña modificada con exito');</script>");
        sesion.invalidate();
    }
%>
</body>
</html>