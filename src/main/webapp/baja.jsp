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
    <div class="toggle">
        <span> Buscar</span>
    </div>
    <div class="formulario" diplay = none>
        <center> <h1> Baja de Cliente</h1></center> <br>
        <h2>Ingrese el cliente a eliminar</h2>
        <form action="#">
            <input type="text" placeholder="Cédula" required>

        </form>
    </div>


    <div class="formulario">
        <h2>Datos</h2>
        <form action="#">
            <input type="text" placeholder="Nombre" required>
            <input type="text" placeholder="Apellido" required>
            <input type="password" placeholder="Contraseña" required>
            <input type="email" placeholder="Correo electronico" required>
            <input type="text" placeholder="Teléfono" required>
            <h5> *Debe verificar si esta en condiciones de ser eliminado</h5> <br>
            <input type="submit"  value="Eliminar">
        </form>
    </div>
    <div class="cancelar">
        <a href="admin-emp.jsp"><input type="submit"  value="Cancelar"></a>
       
      </div>
</div>
    <script src="https://drive.google.com/uc?export=view&id=1Q8RX4zhEuF5DCA2tX9sOmDjrIP5Y_rhc"></script>
    <script src="https://drive.google.com/uc?export=view&id=1gKxmxwLhdJpyZCuW8n24RE2DJ8_t1t3Q"></script>
</body>
</html>