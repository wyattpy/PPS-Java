<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	HttpSession sesion = request.getSession();
	if(sesion.getAttribute("cerrar")!=null){
		request.getSession().invalidate();
		response.sendRedirect("login.jsp");
	}
%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
	<meta charset="utf-8">
	<title><%
		int nivel = 0;
		if(sesion.getAttribute("nivel")!=null) {
			nivel = (Integer) sesion.getAttribute("nivel");
			if (nivel == 1) {
				out.println("Administrador");
			} else {
				if (nivel == 2) {
					out.println("Empleado");
				}
			}
		}
	%></title>
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
				<li><a href="../login.jsp?cerrar=true"><i class="fas fa-power-off"></i></a></li>
			</ul>
		</div>
	</div>
	<!--header menu end-->
	<!--sidebar start-->
	<div class="sidebar">
		<div class="sidebar-menu">
			<center class="profile">
				<img src="https://drive.google.com/uc?export=view&id=1QBkejBK2bGZMByJ8TlU-uQULAox-Rd4A" alt="" width="50" height="50">
				<%
					if(sesion.getAttribute("nivel")!=null) {
						nivel = (Integer) sesion.getAttribute("nivel");
						if (nivel == 1) {
							out.println("<p>Administrador</p>");
						} else {
							if (nivel == 2) {
								out.println("<p>Empleado</p>");
							}
						}
					}
				%>
			</center>

			<li class="item" id="profile">
				<a href="#profile" class="menu-btn">
					<i class="fas fa-user-circle"></i><span>Clientes<i class="fas fa-chevron-down drop-down"></i></span>
				</a>
				<div class="sub-menu">
					<a href="altacliente.jsp"><span>Alta Cliente</span></a>
					<a href="bajacliente.jsp"><span>Baja Cliente</span></a>
					<a href="menubusqueda1.jsp"><span>Modificación Cliente</span></a>
					<a href="menubusqueda2.jsp"><span>Consulta Cliente</span></a>
				</div>
			</li>
			<li class="item" id="cars">
				<a href="#cars" class="menu-btn">
					<i class="fas fa-car"></i><span>Vehículos<i class="fas fa-chevron-down drop-down"></i></span>
				</a>
				<div class="sub-menu">
					<a href="altavehiculo.jsp"><span>Alta Vehículo</span></a>
					<a href="bajavehiculo.jsp"><span>Baja Vehículo</span></a>
					<a href="modificarvehiculo.jsp"><span>Modificación Vehículo</span></a>
					<a href="menubusqueda3.jsp"><span>Consulta Vehículo</span></a>
				</div>
			</li>
            <li class="item" id="paper">
                <a href="#paper" class="menu-btn">
                    <i class="fas fa-copy"></i><span>Contratos<i class="fas fa-chevron-down drop-down"></i></span>
                </a>
                <div class="sub-menu">
                    <a href="altaContrato.jsp"><span>Alta Contrato</span></a>
                    <a href="bajaContrato.jsp"><span>Baja Contrato</span></a>
                    <a href="modificarcontrato.jsp"><span>Modificación de Contrato</span></a>
                    <a href="servConsultaContrato"><span>Consulta Contrato</span></a>
                </div>
            </li>
            <li class="item" id="parking">
                <a href="#parking" class="menu-btn">
                    <i class="fas fa-building"></i><span>Parkings<i class="fas fa-chevron-down drop-down"></i></span>
                </a>
                <div class="sub-menu">
                    <a href="datosconsultaparking.jsp?piso=1"><span>Modificar Piso 1</span></a>
                    <a href="datosconsultaparking.jsp?piso=2"><span>Modificar Piso 2</span></a>
                    <a href="datosconsultaparking.jsp?piso=3"><span>Modificar Piso 3</span></a>
                    <a href="serv"><span>Consulta de Pisos</span></a>
                </div>
            </li>
			<li class="item" id="settings">
				<a href="#settings" class="menu-btn">
					<i class="fas fa-cog"></i><span>Configuración <i class="fas fa-chevron-down drop-down"></i></span>
				</a>
				<div class="sub-menu">
					<a href="passuser.jsp"><i class="fas fa-lock"></i><span>Contraseña</span></a>
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
