<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	HttpSession sesion = request.getSession();
    if(sesion.getAttribute("endsession")!=null){
        response.sendRedirect("acceso.jsp");
    }
%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
	<meta charset="utf-8">
	<title>PPS-Acounts</title>
	<link rel="stylesheet" href="https://drive.google.com/uc?export=view&id=1Vcm29fyAEBwIF8XSfO7lodEOCHWZhS9U">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.0-2/css/all.min.css">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js" charset="utf-8"></script>
</head>
<body>

<!--wrapper start-->
<div class="wrapper">
	<!--header menu start-->
	<div class="header">
		<div class="header-menu">
			<div class="title">
				<center>Paraguay Parking System</center>
			</div>
			<div class="sidebar-btn">
				<i class="fas fa-bars"></i>
			</div>
			<ul>
				<li><a href="#"><i class="fas fa-sync-alt"></i></a></li>
				<li><a href="acceso.jsp?endsession=true"><i class="fas fa-power-off"></i></a></li>
			</ul>
		</div>
	</div>
	<!--header menu end-->
	<!--sidebar start-->
	<div class="sidebar">
		<div class="sidebar-menu">
			<center class="profile">
				<img src="https://drive.google.com/uc?export=view&id=1QBkejBK2bGZMByJ8TlU-uQULAox-Rd4A" alt="" width="50" height="50">
				<p><%= sesion.getAttribute("nombre")%> <%= sesion.getAttribute("apellido")%></p>
				<p>Tipo de Cuenta: <%= sesion.getAttribute("cuenta")%></p>
			</center>

			<li class="item" id="cars">
				<a href="#profile" class="menu-btn">
					<i class="fas fa-user-circle"></i><span>Vehiculos<i class="fas fa-chevron-down drop-down"></i></span>
				</a>
				<div class="sub-menu">
					<a href="404.html"><span>Asociar Vehiculo</span></a>
					<a href="404.html"><span>Eliminar Vehiculo</span></a>
					<a href="404.html"><span>Mis vehiculos registrados</span></a>
				</div>
			</li>
			<li class="item" id="profile">
				<a href="#cars" class="menu-btn">
					<i class="fas fa-car"></i><span>Contratos<i class="fas fa-chevron-down drop-down"></i></span>
				</a>
				<div class="sub-menu">
					<%
                        if(sesion.getAttribute("cuenta")!=null){
                            String cuenta = (String) sesion.getAttribute("cuenta");
                            if(cuenta.equals(null)){
                                System.out.print("<a href="+"\\"+"404.html"+"\\"+"><span>Crear Contrato</span></a>");
                            }
                            else
                                System.out.print("<a href="+"\\"+"404.html"+"\\"+"><span>Administrar mi Contrato</span></a>");
                        }
					%>
				</div>
			</li>
			<li class="item" id="settings">
				<a href="#settings" class="menu-btn">
					<i class="fas fa-cog"></i><span>Configuración <i class="fas fa-chevron-down drop-down"></i></span>
				</a>
				<div class="sub-menu">
					<a href="404.html"><i class="fas fa-user-circle"></i><span>Mi Cuenta</span></a>
					<a href="passcliente.jsp"><i class="fas fa-lock"></i><span>Cambiar Contraseña</span></a>
				</div>
			</li>
		</div>
	</div>
	<!--sidebar end-->
	<!--main container start-->
	<div class="main-container">
		<div align="center">
			<img src="https://drive.google.com/uc?export=view&id=138FDoZmoKysHdSeMuWs6z53e5zPF8paa" width="600" height="600">
		</div>
	</div>
	<!--main container end-->
</div>
<!--wrapper end-->

<script type="text/javascript">
	$(document).ready(function(){
		$(".sidebar-btn").click(function(){
			$(".wrapper").toggleClass("collapse");
		});
	});
</script>

</body>
</html>
