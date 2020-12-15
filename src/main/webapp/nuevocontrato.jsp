<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
    int plan = Integer.parseInt((String) request.getAttribute("plan"));
    String precio;
    if(plan == 1){
        precio="₲ 400.000";
    }
    else{
        precio="₲ 15.000.000";
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
    <a href="/"><i class="fas fa-home"></i></a>
</div>
<div class="login">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form action="servAltaContratoCli" method="post">
        <label>
            <input name="txtFechaInicio" type="Text" placeholder="Fecha Inicio" required>
            <input name="txtFechaFin" type="Text" placeholder="Fecha Fin" required>
            <input name="txtTipoContrato" type="Text" value="<%= out.print(plan)%>" disabled>
            <input name="txtPrecio" type="Text" value="<%= out.print(precio)%>" disabled>
            <p>Al comprar este contrato acepta los <a href="terminosycondociones.html"> terminos y condiciones</a>.</p>
            <input type="submit"  value="Registrar Contrato" name="btnAlta">
        </label>
    </form>
</div>
<%
    if(request.getAttribute("verd")!=null){
        out.println("<script>alert('Su contrato esta siendo procesado, nos pondremos en contacto con usted en unos momentos.');</script>");
    }
    if(request.getAttribute("verdfal")!=null){
        out.println("<script>alert('Error al procesar su contrato, .');</script>");
    }
%>
</body>
</html>
