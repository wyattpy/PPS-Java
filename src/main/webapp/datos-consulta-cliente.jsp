<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                <h2>Consulta</h2>
               <%
                   HttpSession sesion = request.getSession();
                   out.println(sesion.getAttribute("nombre")+"</br>");
                   out.println(sesion.getAttribute("apellido")+"</br>");
                   out.println(sesion.getAttribute("cedula")+"</br>");
                   out.println(sesion.getAttribute("contraseña")+"</br>");
                   out.println(sesion.getAttribute("telefono")+"</br>");
                   out.println(sesion.getAttribute("direccion")+"</br>");
                   out.println(sesion.getAttribute("correo"));
               %>
            </div>
            <div class="Volver">
                <a href="consulta-cliente.jsp"><input type="submit"  value="Volver"></a>
              </div>
       </div>
           <script src="https://drive.google.com/uc?export=view&id=1Q8RX4zhEuF5DCA2tX9sOmDjrIP5Y_rhc"></script>
           <script src="https://drive.google.com/uc?export=view&id=1gKxmxwLhdJpyZCuW8n24RE2DJ8_t1t3Q"></script>
    </body>
</html>