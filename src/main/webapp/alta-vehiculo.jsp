<%--
  Created by IntelliJ IDEA.
  User: RYZEN
  Date: 27/11/2020
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> Alta Vehiculo </title>
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
        <h1> Alta vehiculo</h1>
        <h2>Ingrese los datos</h2>
        <form action="servAltaVehiculo" method="post">
            <input name="txtMatricula" type="text" placeholder="Matrícula" required >
            <input name="txtMarca" type="text" placeholder="Marca" required>
            <input name="txtModelo" type="text" placeholder="Modelo" required>
            <input name="txtColor" type="text" placeholder="Color" required>
            <input name="txtCi_Cliente" type="text" placeholder="Cédula del cliente" required>
            <input type="submit"  value="Registrar vehículo" name="btnAlta">
        </form>
    </div>
    <div class="cancelar">
        <a href="home.jsp"><input type="submit"  value="Cancelar"></a>
    </div>
</div>
<script src="https://drive.google.com/uc?export=view&id=1Q8RX4zhEuF5DCA2tX9sOmDjrIP5Y_rhc"></script>
<script src="https://drive.google.com/uc?export=view&id=1gKxmxwLhdJpyZCuW8n24RE2DJ8_t1t3Q"></script>
<%
    HttpSession sesion = request.getSession();
    if(request.getAttribute("verdad")!=null){
        int verdad = (Integer) request.getAttribute("verdad");
        if(verdad == 0){
            out.println("<script>alert('Vehiculo existente');</script>");
        }
        else{
            if(verdad == 1){
                out.println("<script>alert('Vehículo guardado con exito');</script>");
            }
            else
                out.println("<script>alert('Error desconocido');</script>");
        }
    }
%>
</body>
</html>
