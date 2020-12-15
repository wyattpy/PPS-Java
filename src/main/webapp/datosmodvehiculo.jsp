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

            <h1>Modificación de vehiculo</h1>
            <form action="servModVehiculo" method="POST">
                <label>
                    <input name="txtMatricula" value="<%=request.getAttribute("matricula")%>" type="text" disabled >
                    <input name="txtMarca" value="<%=request.getAttribute("marca")%>" type="text" disabled>
                    <input name="txtModelo" value="<%=request.getAttribute("modelo")%>" type="text" disabled>
                    <input name="txtColor" value="<%=request.getAttribute("color")%>" type="text" required>
                    <input name="txtCi_Cliente" value="<%=request.getAttribute("cliente")%>" type="text" disabled>
                    <input type="submit"  value="Modificar" name="btnMod">
                </label>
            </form>
        </div>
        <div class="cancelar">
            <a href="home.jsp"><input type="submit"  value="Cancelar"></a>
        </div>
    </div>
    </body>
</html>


