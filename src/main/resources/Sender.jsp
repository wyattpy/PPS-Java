<%--
  Created by IntelliJ IDEA.
  User: diego
  Date: 29/10/2020
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page session="true" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    HttpSession sesion = request.getSession();
    int nivel = 0;
    if(request.getAttribute("nivel")!=null){
        nivel = (Integer) request.getAttribute("nivel");
        if(nivel == 1){
            sesion.setAttribute("user", request.getAttribute("user"));
            sesion.setAttribute("nivel", 1);
            response.sendRedirect("Admin.jsp");
        }

    }
%>
</body>
</html>
