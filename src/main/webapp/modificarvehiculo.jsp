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
    <link rel= "stylesheet" href= "https://drive.google.com/uc?export=view&id=1MNdaRPn4qbuS0rG0ctlZIYkpor-5xoiZ">
</head>

<body>

<div class="contenedor-form">

    <div class="">
        <form action="#">
        </form>
    </div>

    <div class="formulario" align= center>

        <h1> Modificación de vehiculo </h1> <br>
        <h2>Ingrese el vehiculo a modificar</h2>
        <form action="servConsultaModVehiculo" method="POST">
            <input name= "txtMatricula" type="text" placeholder="Matricula" required>
            <input type="submit"  value="Buscar" name="btnBuscar">
        </form>
    </div>
    <div class="cancelar">
        <a href="home.jsp"><input type="submit"  value="Cancelar"></a>
    </div>
</div>



<%
    if(request.getAttribute("verdvvv")!=null){
        out.println("<script>alert('Vehiculo modificado');</script>");
    }
    else
        out.println("<script>alert('Vehiculo no modificado(ignore el mensaje si acaba de abrir la pagina)');</script>");
%>
</body>
</html>