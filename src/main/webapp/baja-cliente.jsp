<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="true" %>
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
    <div class="toggle">
        <span>Desplegar info</span>
    </div>
    <div class="formulario" diplay = none>
        <center> <h1> Baja de Cliente</h1></center> <br>
        <h2>Ingrese el cliente a eliminar</h2>
        <form action="SERVBAJA" method="post">
            <input name="txtCedula" type="text" placeholder="Cédula" required>
            <input type="submit" value="Eliminar" name="btnEliminar">
        </form>
    </div>
    <div class="cancelar">
        <a href="admin-emp.jsp"><input type="submit"  value="Cancelar"></a>
       
      </div>
</div>
    <script src="https://drive.google.com/uc?export=view&id=1Q8RX4zhEuF5DCA2tX9sOmDjrIP5Y_rhc"></script>
    <script src="https://drive.google.com/uc?export=view&id=1gKxmxwLhdJpyZCuW8n24RE2DJ8_t1t3Q"></script>
<%
    HttpSession sesion = request.getSession();
    if(request.getAttribute("verdad")!=null){
        out.println("<script>alert('Cliente eliminado con exito');</script>");
    }
%>
</body>
</html>