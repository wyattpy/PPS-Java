<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title> PPS - Alta Contrato </title>
        <link  rel="icon" sizes="152px" href="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" type="image/png" />
        <link rel= "stylesheet" href= "https://drive.google.com/uc?export=view&id=1GqIVYgLDRvI1I1xvaXGKuE1xlq8lcm7r">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">

    </head>
    <body>
       <div align="left">
           <a href="home.jsp"><i class="fas fa-home"></i></a>
       </div>
       <div class="formulariosGrandes">
           <div align="center">
               <img src="https://drive.google.com/uc?export=view&id=1wD2pilGb_McT5LDFCOmfQd0p53O3P8Xz" alt="" width="100" height="100">
           </div>
           <form action="servAltaContrato" method="post">
               <label>
                   <input name="txtCedula" type="text" placeholder="Cédula de identidad" required >
                   <input name="txtTotalContrato" type="text" placeholder="Total del Contrato" required>
                   <input name="txtFechaInicio" type="text" placeholder="Fecha de Inicio" required>
                   <input name="txtFechaFin" type="text" placeholder="Fecha de Fin" required>
                   <input name="txtDescripcion" type="text" placeholder="Descripcion" required>
                   <input name="txtEstado" type="text" placeholder="Estado" required>
                   <input name="txtTipoContrato" type="text" placeholder="Tipo de Contrato" required>
                   <input type="submit"  value="Registrar Contrato" name="btnAlta">
               </label>
           </form>
       </div>
       <%
           if(request.getAttribute("contratok")!=null){
               out.println("<script>alert('Contrato agregado');</script>");
           }
           if(request.getAttribute("contratno")!=null){
               out.println("<script>alert('Error al agregar el contrato');</script>");
           }
       %>
    </body>
</html>