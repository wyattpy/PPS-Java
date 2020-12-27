<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <head>
        <meta charset="UTF-8">
        <title> PPS Consulta Parking</title>
        <link  rel="icon" sizes="152px" href="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" type="image/png" />
        <link rel= "stylesheet" href= "https://drive.google.com/uc?export=view&id=1GqIVYgLDRvI1I1xvaXGKuE1xlq8lcm7r">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">
    </head>

<body>

<div align="left">
    <a href="menubusqueda4.jsp"><i class="fas fa-home"></i></a>
</div>
<div class="login">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form>

        <label>
            <input name="txtNroPiso" value="<%=request.getAttribute("nro_piso")%>" type="text" disabled>
            <input name=txtLugaresDisponibles" value="<%=request.getAttribute("lugares_disponibles")%>" type="text" disabled>
            <input name="txtLleno" value="<%=request.getAttribute("lleno")%>" type="text" disabled>
        </label>
    </form>
</div>
</body>
</html>