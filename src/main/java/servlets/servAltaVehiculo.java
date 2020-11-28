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
        int respues;
        try (PrintWriter out = response.getWriter()) {
            String matricula;
            String marca;
            String modelo;
            String color;
            String ci_cliente;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if (request.getParameter("btnAlta") != null) {
                matricula = request.getParameter("txtMatricula");
                marca = request.getParameter("txtMarca");
                modelo = request.getParameter("txtModelo");
                color = request.getParameter("txtColor");
                ci_cliente = request.getParameter("txtCi_Cliente");
                respues = acc.altaVehiculo(matricula,marca, modelo, color, ci_cliente);
                if(respues == 1){
                    request.setAttribute("verdad",1);
                    rd=request.getRequestDispatcher("alta-vehiculo.jsp");
                }
                else{
                    request.setAttribute("verdad",0);
                    rd=request.getRequestDispatcher("alta-vehiculo.jsp");
                }
            }
            rd.forward(request,response);
        }
    }
}