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
<div class="login">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form action="servLoginCliente" method="POST">
        <input name="txtCedula" type="text" placeholder="Cedula" required>
        <input name="txtPass" type="password" placeholder="Contraseña" required>
        <input type="submit" value="Iniciar Sesión" name="btnLogin">
    </form>
</div>
<%
    HttpSession sesion = request.getSession();
    String nombre;

    if(request.getAttribute("nombre")!=null){
        nombre = (String) request.getAttribute("nombre");
        if(!nombre.equals("")){
            sesion.setAttribute("nombre", nombre);
            sesion.setAttribute("apellido", request.getAttribute("apellido"));
            sesion.setAttribute("cedula",request.getAttribute("cedula"));
            sesion.setAttribute("pass",request.getAttribute("pass"));
            sesion.setAttribute("telefono",request.getAttribute("telefono"));
            sesion.setAttribute("direccion",request.getAttribute("direccion"));
            sesion.setAttribute("correo",request.getAttribute("correo"));
            sesion.setAttribute("idcontrato",request.getAttribute("idcontrato"));
            sesion.setAttribute("total",request.getAttribute("total"));
            sesion.setAttribute("fechaini",request.getAttribute("fechaini"));
            sesion.setAttribute("fechafin",request.getAttribute("fechafin"));
            sesion.setAttribute("estado",request.getAttribute("estado"));
            sesion.setAttribute("tipo",request.getAttribute("tipo"));
            sesion.setAttribute("observaciones",request.getAttribute("observaciones"));
            response.sendRedirect("menu.jsp");
        }
        else{
            out.println("<script>alert('Usuario o contraseña incorrecta, verifique sus credenciales');</script>");
        }
    }
    if(request.getParameter("fake")!=null){
        out.println("<script>alert('Error. No has accedido al sistema...');</script>");
    }
    if(request.getParameter("contratocreado")!=null){
        out.println("<script>alert('Su contrato esta siendo procesado, nos pondremos en contacto con usted en unos momentos');</script>");
    }
    if(request.getParameter("modok")!=null){
        sesion.invalidate();
        out.println("<script>alert('Cambios realizados con exitos, vuelve a loginearte');</script>");
    }
    if(request.getParameter("endsession")!=null){
        sesion.invalidate();
        out.println("<script>alert('Gracias por utilizar los servicios de PPS');</script>");
    }
%>
</body>
</html>