<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
    String cedula = (String)sesion.getAttribute("txtCedula");
    response.sendRedirect("SERVMOD");
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
            <div class="formulario">
                <h2>Modificar</h2>
               <form action="#" method="post">
                    <input name="txtNombre" type="text" placeholder="<%=("txtNombre")%>" >
                   <input name="txtApellido" type="text" placeholder="<%=sesion.getAttribute("txtApellido")%>" >
                   <input name="txtDir" type="text" placeholder="<%=sesion.getAttribute("txtDir")%>" >
                    <input name="txtPass" type="password" placeholder="<%=sesion.getAttribute("txtPass")%>" >
                    <input name="txtCorreo" type="email" placeholder="<%=sesion.getAttribute("txtCorreo")%>" >
                    <input name="txtTel" type="text" placeholder="<%=sesion.getAttribute("txtTel")%>" >
                    <input name="btnMod" type="submit"  value="Modificar">
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