<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	HttpSession sesion = request.getSession();
	if(sesion.getAttribute("cedula")==null){
		response.sendRedirect("acceso.jsp?fake=true");
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
			</center>
			<li class="item" id="contrato">
				<a href="#contrato" class="menu-btn">
					<i class="far fa-copy"></i><span>Contratos <i class="fas fa-chevron-down drop-down"></i></span>
				</a>
				<div class="sub-menu">
					<%
						if(sesion.getAttribute("idcontrato")==null){
							out.print("<a href=\"planes.jsp\"><i class=\"fas fa-copy\"></i><span>Nuevo Contrato</span></a>");
						}
						else
							out.print("<a href=\"plancliente.jsp\"><i class=\"fas fa-copy\"></i><span>Mi Contrato</span></a>");
					%>
				</div>
			</li>
			<li class="item" id="settings">
				<a href="#settings" class="menu-btn">
					<i class="fas fa-cog"></i><span>Configuración <i class="fas fa-chevron-down drop-down"></i></span>
				</a>
				<div class="sub-menu">
					<a href="micuenta.jsp"><i class="far fa-user"></i><span>Mi Cuenta</span></a>
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
<%
	if(request.getParameter("wellcome")!=null){
		out.println("<script>alert('Bienvenido al mundo de PPS "+sesion.getAttribute("nombre")+"');</script>");
	}
	if(request.getAttribute("contratook")!=null){
		response.sendRedirect("acceso.jsp?contratocreado=true");
	}
	if(request.getAttribute("contratono")!=null){
		out.println("<script>alert('Error: " +request.getAttribute("contratono") +"');</script>");
	}
	if(request.getAttribute("contratosno")!=null){
		out.println("<script>alert('No posee contratos');</script>");
	}
%>
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
