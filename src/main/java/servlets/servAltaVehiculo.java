package servlets;


import clases.accionesDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "servAltaVehiculo")
public class servAltaVehiculo extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try (PrintWriter out = response.getWriter()) {
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if (request.getParameter("btnAlta") != null) {
                String matricula = request.getParameter("txtMatricula");
                String marca = request.getParameter("txtMarca");
                String modelo = request.getParameter("txtModelo");
                String color = request.getParameter("txtColor");
                String ci_cliente = request.getParameter("txtCi_Cliente");
                i = acc.altaVehiculo(matricula,marca,modelo,color,ci_cliente);
                if(i!=0){
                    request.setAttribute("vehiculook",0);
                }
                else{
                    request.setAttribute("vehiculono",0);
                }
            }
            rd=request.getRequestDispatcher("altavehiculo.jsp");
            rd.forward(request,response);
        }
    }
}