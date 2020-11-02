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
            <div class="formulario">
                <h2>Modificar</h2>
               <form action="#" method="post">
                    <input type="text" placeholder="<%=sesion.getAttribute("nombre")%>" >
                   <input type="text" placeholder="<%=sesion.getAttribute("apellido")%>" >
                   <input type="text" placeholder="<%=sesion.getAttribute("direccion")%>" >
                    <input type="password" placeholder="<%=sesion.getAttribute("contrasena")%>" >
                    <input type="email" placeholder="<%=sesion.getAttribute("correo")%>" >
                    <input type="text" placeholder="<%=sesion.getAttribute("telefono")%>" >
                    <input type="submit"  value="Modificar">
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