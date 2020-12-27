<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
%>
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
    <a href="menubusqueda6.jsp"><i class="fas fa-home"></i></a>
</div>
<div class="formulariosGrandes">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <input name="txtCedula" value="<%=sesion.getAttribute("cedula")%>" type="text" readonly>
    <input name="txtIdContrato" value="<%=request.getAttribute("idContrato")%>" type="text" readonly>
    <input name="txtTotal" value="<%=request.getAttribute("total")%>" type="text" readonly>
    <input name="txtFechaIni" value="<%=request.getAttribute("fechaini")%>" type="text" readonly>
    <input name="txtFechaFin" value="<%=request.getAttribute("fechafin")%>" type="text" readonly>
    <input name="txtEstado" value="<%=request.getAttribute("estado")%>" type="text" readonly>
    <input name="txtTipo" value="<%=request.getAttribute("tipo")%>" type="text" readonly>
    <input name="txtObservaciones" value="<%=request.getAttribute("observaciones")%>" type="text" readonly>
</div>
<%
    if(request.getAttribute("nocontratos")!=null){
        response.sendRedirect("menubusqueda6.jsp?contratosno=true");
    }
%>
</body>
</html>