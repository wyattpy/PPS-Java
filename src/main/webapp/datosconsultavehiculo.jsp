<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> PPS Consulta Vihículo</title>
    <link  rel="icon" sizes="152px" href="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" type="image/png" />
    <link rel= "stylesheet" href= "https://drive.google.com/uc?export=view&id=1GqIVYgLDRvI1I1xvaXGKuE1xlq8lcm7r">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">
</head>

<body>

<div align="left">
    <a href="menubusqueda3.jsp"><i class="fas fa-home"></i></a>
</div>
<div class="formulariosGrandes">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form>
        <label>
            <input name="txtMatricula" value="<%=request.getAttribute("matricula")%>" type="text" disabled>
            <input name="txtMarca" value="<%=request.getAttribute("marca")%>" type="text" disabled>
            <input name="txtModelo" value="<%=request.getAttribute("modelo")%>" type="text" disabled>
            <input name="txtColor" value="<%=request.getAttribute("color")%>" type="text" disabled>
            <input name="txtCliente" value="<%=request.getAttribute("cliente")%>" type="text" disabled>

        </label>
    </form>
</div>
</body>
</html>


