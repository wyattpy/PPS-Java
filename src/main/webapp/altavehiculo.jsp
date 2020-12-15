<%--
  Created by IntelliJ IDEA.
  User: RYZEN
  Date: 27/11/2020
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
%>
<!DOCTYPE html>

<html lang="es">
<head>
    <meta charset="UTF-8">
    <title> Alta Vehiculo </title>
    <link  rel="icon" sizes="152px" href="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" type="image/png" />
    <link rel= "stylesheet" href= "https://drive.google.com/uc?export=view&id=1GqIVYgLDRvI1I1xvaXGKuE1xlq8lcm7r">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">
</head>
<body>

<div align="left">
    <a href="home.jsp"><i class="fas fa-home"></i></a>
</div>
<div class="formulariosGrandes">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <h1> Alta vehiculo</h1>
    <h2>Ingrese los datos</h2>
    <form action="servAltaVehiculo" method="POST">
        <label>
            <input name="txtMatricula" type="text" placeholder="Matrícula" required >
            <input name="txtMarca" type="text" placeholder="Marca" required>
            <input name="txtModelo" type="text" placeholder="Modelo" required>
            <input name="txtColor" type="text" placeholder="Color" required>
            <input name="txtCi_Cliente" type="text" placeholder="Cédula del cliente" required>
            <input type="submit"  value="Registrar vehículo" name="btnAlta">
        </label>
    </form>
</div>

<<<<<<< Updated upstream
<div align="left">
    <a href="home.jsp"><i class="fas fa-home"></i></a>
</div>
<div class="formulariosGrandes">
    <div align="center">
        <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
    </div>
    <form action="servAltaCliente" method="post">
        <label>
            <input name="txtCedula" type="text" placeholder="Cédula de identidad" required >
            <input name="txtPass" type="password" placeholder="Contraseña" required>
            <input name="txtNombre" type="text" placeholder="Nombre" required>
            <input name="txtApellido" type="text" placeholder="Apellido" required>
            <input name="txtTel" type="text" placeholder="Teléfono" required>
            <input name="txtDir" type="text" placeholder="Dirección" required>
            <input name="txtCorreo" type="text" placeholder="Correo electronico" required>
            <input type="submit"  value="Registrar cliente" name="btnAlta">
        </label>
    </form>
</div>
=======
>>>>>>> Stashed changes
<%
    if(request.getAttribute("vehiculook")!=null){
        out.println("<script>alert('Vehículo agregado');</script>");
    }
    if(request.getAttribute("vehiculono")!=null){
        out.println("<script>alert('Vehículo duplicado, error al insertar');</script>");
    }
%>
</body>
</html>
