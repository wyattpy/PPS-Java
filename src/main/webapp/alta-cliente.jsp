<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="true" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title> Alta Cliente </title>
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
               <h1> Alta cliente</h1>
                <h2>Ingrese los datos</h2>
               <form action="servAltaCliente" method="post">
                   <input name="txtCedula" type="text" placeholder="Cédula de identidad" required >
                   <input name="txtPass" type="password" placeholder="Contraseña" required>
                   <input name="txtNombre" type="text" placeholder="Nombre" required>
                   <input name="txtApellido" type="text" placeholder="Apellido" required>
                   <input name="txtTel" type="text" placeholder="Teléfono" required>
                   <input name="txtDir" type="text" placeholder="Dirección" required>
                   <input name="txtCorreo" type="email" placeholder="Correo electronico" required>

               <input type="submit"  value="Registrar cliente" name="btnAlta">
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
                   out.println("<script>alert('Cedula existente');</script>");
               }
               else{
                   if(verdad == 1){
                       out.println("<script>alert('Cliente guardado con exito');</script>");
                   }
                   else
                       out.println("<script>alert('Error desconocido');</script>");
               }
           }
       %>
    </body>
</html>