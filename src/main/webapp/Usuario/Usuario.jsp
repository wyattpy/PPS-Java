<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 30/10/2020
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("nivel") == null){
        response.sendRedirect("../login.jsp");
    }
    else {
        String nivel = sesion.getAttribute("nivel").toString();
        if(!nivel.equals("2")) {
            response.sendRedirect("../login.jsp");
        }
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="right">
    Bienvenid@ Sr@ <%= sesion.getAttribute("user")%>
    <a href="../login.jsp?cerrar=true">Cerrar Sesion</a>
</div>
<h1>ENTRO COMO CLIENTE</h1>

</body>
</html>
