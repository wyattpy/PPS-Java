<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> PPS - Busquedas </title>
    <link  rel="icon" sizes="152px" href="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" type="image/png" />
    <link rel= "stylesheet" href= "https://drive.google.com/uc?export=view&id=1GqIVYgLDRvI1I1xvaXGKuE1xlq8lcm7r">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">
</head>
<body>
<div align="left">
    <a href="home.jsp"><i class="fas fa-home"></i></a>
</div>
<div class="login">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form action="servConsultaModCliente" method="post">
        <label>
            <div align="center">
                <p style="font-family: 'Times New Roman'; color: black">Ingrese la cedula del Cliente:</p>
            </div>
            <input name= "txtCedula" type="text" placeholder="Cédula" required>
            <input type="submit"  value="Buscar" name="btnBuscar">
        </label>
    </form>
</div>
<%
    if(request.getAttribute("modok")!=null){
        out.println("<script>alert('Cliente modificado con exito');</script>");
    }
    if(request.getAttribute("modno")!=null){
        out.println("<script>alert('Cliente no modificado');</script>");
    }
%>
</body>
</html>