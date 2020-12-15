<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
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
           <a href="menubusqueda1.jsp"><i class="fas fa-home"></i></a>
       </div>
       <div class="formulariosGrandes">
           <div align="center">
               <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
           </div>
           <form action="servActualizarCliente" method="post">
               <label>
                   <input name="txtCedula" value="<%=request.getAttribute("cedula")%>" type="text" disabled>
                   <input name="txtContrasena" value="<%=request.getAttribute("contrasena")%>" type="text" required>
                   <input name="txtNombre" value="<%=request.getAttribute("nombre")%>" type="text" required>
                   <input name="txtApellido" value="<%=request.getAttribute("apellido")%>" type="text" required>
                   <input name="txtTel" value="<%=request.getAttribute("telefono")%>" type="text" required>
                   <input name="txtDir" value="<%=request.getAttribute("direccion")%>" type="text" required>
                   <input name="txtCorreo" value="<%=request.getAttribute("correo")%>" type="text" required>
                   <input type="submit"  value="Modificar" name="btnMod">
               </label>
           </form>
       </div>
    </body>
</html>