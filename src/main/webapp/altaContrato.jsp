<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title> Alta Consulta </title>
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
               <h1> Alta consulta</h1>
                <h2>Ingrese los datos</h2>
               <form action="servAltaCliente" method="POST">
                   <label>
                       <input name="id_cliente" type="int" placeholder="Cédula de identidad del Cliente" required >
                       <input name="txttotal_contrato" type="Text" placeholder="Total Contrato" required>
                       <input name="txtfecha_inicio" type="Text" placeholder="Fecha Inicio" required>
                       <input name="txtfecha_fin" type="Text" placeholder="Fecha Fin" required>
                       <input name="txtDescripcion" type="Text" placeholder="Descripción" required>
                       <input name="txtestado" type="Text" placeholder="Estado" required>
                       <input name="txttipo_Contrato" type="Text" placeholder="Tipo Contrato" required>
                       <input type="submit"  value="Registrar Contrato" name="btnAlta">
                   </label>
             </form>
            </div>
            <div class="cancelar">
                <a href="home.jsp"><input type="submit" value="Cancelar"></a>
            </div>
       </div>
           <script src="https://drive.google.com/uc?export=view&id=1Q8RX4zhEuF5DCA2tX9sOmDjrIP5Y_rhc"></script>
           <script src="https://drive.google.com/uc?export=view&id=1gKxmxwLhdJpyZCuW8n24RE2DJ8_t1t3Q"></script>
       <%
           if(request.getAttribute("verd")!=null){
               out.println("<script>alert('Contrato del Cliente agregado');</script>");
           }
           else
               out.println("<script>alert('Contrato duplicado (ignore el mensaje si acaba de abrir la pagina)');</script>");
       %>
    </body>
</html>