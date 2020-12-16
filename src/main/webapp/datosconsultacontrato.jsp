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
    <a href="ConsultaContrato.jsp"><i class="fas fa-home"></i></a>
</div>
<div class="formulariosGrandes">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
        <label>
            <input name="txtIdContrato" value="<%=request.getAttribute("id_contrato")%>" type="text" required>
            <input name="txtIdCliente" value="<%=request.getAttribute("id_cliente")%>" type="text" required>
            <input name="txtTotalContrato" value="<%=request.getAttribute("total_contrato")%>" type="text" required>
            <input name="txtFechaInicio" value="<%=request.getAttribute("fecha_inicio")%>" type="text" required>
            <input name="txtFechaFin" value="<%=request.getAttribute("fecha_fin")%>" type="text" required>
            <input name="txtDescripcion" value="<%=request.getAttribute("descripciom")%>" type="text" required>
            <input name="txtEstado" value="<%=request.getAttribute("correo")%>" type="text" required>
            <input name="txtTipoContrato" value="<%=request.getAttribute("correo")%>" type="text" required>
        </label>
    </form>
</div>
</body>
</html>