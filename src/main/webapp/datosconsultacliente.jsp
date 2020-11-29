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
         
           <div  class="toggle">
               <span> Desplegar Datos </span>
           </div>
           <div class="formulario" align= center>
               <h1>Consulta de clientes</h1>
               <form>
                   <label>
                       <input name="txtCedula" value="<%=request.getAttribute("cedula")%>" type="text" disabled>
                       <input name="txtPass" value="<%=request.getAttribute("contrasena")%>" type="text" disabled>
                       <input name="txtNombre" value="<%=request.getAttribute("nombre")%>" type="text" disabled>
                       <input name="txtApellido" value="<%=request.getAttribute("apellido")%>" type="text" disabled>
                       <input name="txtTel" value="<%=request.getAttribute("telefono")%>" type="text" disabled>
                       <input name="txtDir" value="<%=request.getAttribute("direccion")%>" type="text" disabled>
                       <input name="txtCorreo" value="<%=request.getAttribute("correo")%>" type="email" disabled>
                   </label>
               </form>
           </div>
            <div class="Volver">
                <a href="menubusqueda2.jsp"><input type="submit"  value="Volver"></a>
            </div>
       </div>
           <script src="https://drive.google.com/uc?export=view&id=1Q8RX4zhEuF5DCA2tX9sOmDjrIP5Y_rhc"></script>
           <script src="https://drive.google.com/uc?export=view&id=1gKxmxwLhdJpyZCuW8n24RE2DJ8_t1t3Q"></script>
    </body>
</html>