<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="true" %>
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
               <form action="SERVACTU" method="post">
                   <input name="txtCedula" type="text" placeholder="Cedula" >
                    <input name="txtNombre" type="text" placeholder="Nombre" >
                   <input name="txtApellido" type="text" placeholder="Apellido" >
                   <input name="txtDir" type="text" placeholder="Direccion" >
                    <input name="txtPass" type="password" placeholder="Contraseña" >
                    <input name="txtCorreo" type="email" placeholder="Correo" >
                    <input name="txtTel" type="text" placeholder="Telefono" >
                    <input name="btnMod" type="submit"  value="Modificar">
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
           int verd = 0;
           if(request.getAttribute("verd")!=null){
               verd = (Integer) request.getAttribute("verd");
               if(verd == 1){
                   out.println("<script>alert('Error al acutalizar');</script>");
               }
               else{
                   out.println("<script>alert('Actualizado con exito');</script>");
               }
           }
       %>
    </body>
</html>