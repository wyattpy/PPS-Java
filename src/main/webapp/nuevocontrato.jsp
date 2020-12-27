<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("cedula")==null){
        response.sendRedirect("acceso.jsp?fake=true");
    }
    int plan = Integer.parseInt(request.getParameter("plan"));
    String cedula = (String) sesion.getAttribute("cedula");
    String planS = null;
    int precio = 0;
    if(plan == 1){
        precio=400000;
        planS = "Premium";
    }
    else{
        if(plan == 2){
            precio=15000000;
            planS="Ejecutivo";
        }
        else{
            response.sendRedirect("acceso.jsp?fake=true");
        }
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
<div class="login">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form action="servAltaContratoCli" method="post">
        <label>
            <input type="text" name="txtCedula" value="<%=cedula%>" readonly>
            <input name="txtFechaInicio" type="text" placeholder="Fecha Inicio-yyyy/MM/dd" required>
            <input name="txtTipoContrato" type="Text" value="<%=planS%>" readonly>
            <input name="txtPrecio" type="Text" value="<%=precio%>" readonly>
            <input type="submit"  value="Registrar Contrato" name="btnAlta">
        </label>
    </form>
</div>
</body>
</html>
