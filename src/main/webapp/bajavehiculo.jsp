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
        <h1> Baja vehiculo</h1>
        <h2>Ingrese los datos</h2>
        <form action="servBajaVehiculo" method="POST">
            <input name="txtMatricula" type="text" placeholder="Matricula" required>
            <input type="submit" value="Eliminar" name="btnEliminar">
        </form>

    </div>
    <div class="cancelar">
        <a href="home.jsp"><input type="submit"  value="Cancelar"></a>
    </div>
</div>
<%
    if(request.getAttribute("bajaok")!=null){
        out.println("<script>alert('Vehiculo eliminado con exito');</script>");
    }
    else
        out.println("<script>alert('El Vehiculo no existe (ignore el mensaje si acaba de abrir la pagina)');</script>");
%>
</body>
</html>