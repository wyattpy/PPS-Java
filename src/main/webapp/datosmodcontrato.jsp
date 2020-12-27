<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
    sesion.setAttribute("cedula",request.getAttribute("cedula"));
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
    <a href="modificarcontrato.jsp"><i class="fas fa-home"></i></a>
</div>
<div class="formulariosGrandes">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form action="servActualizarContrato" method="post">
        <label>
            <input name="txtCedula" value="<%=sesion.getAttribute("cedula")%>" type="text" readonly>
            <input name="txtIdContrato" value="<%=request.getAttribute("idContrato")%>" type="text" readonly>
            <input name="txtTotal" value="<%=request.getAttribute("total")%>" type="text" placeholder="Total" required>
            <input name="txtFechaIni" value="<%=request.getAttribute("fechaini")%>" type="text" placeholder="Fecha de Inicio - yyyy/MM/dd" required>
            <input name="txtFechaFin" value="<%=request.getAttribute("fechafin")%>" type="text" placeholder="Fecha de Fin - yyyy/MM/dd" required>
            <input name="txtEstado" value="<%=request.getAttribute("estado")%>" type="text" placeholder="Estado" required>
            <input name="txtTipo" value="<%=request.getAttribute("tipo")%>" type="text" placeholder="Tipo" required>
            <input name="txtObservaciones" value="<%=request.getAttribute("observaciones")%>" type="text" placeholder="Observaciones" required>
            <input type="submit"  value="Modificar" name="btnMod">
        </label>
    </form>
</div>
</body>
</html>
