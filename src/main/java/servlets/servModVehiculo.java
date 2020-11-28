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

@WebServlet(name = "servModVehiculo")
public class servModVehiculo extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int respues = 9;
        try(PrintWriter out = response.getWriter()){
            String matricula = request.getParameter("txtMatricula");
            String idVehiculo;
            String marca;
            String modelo;
            String color;
            String ci_cliente;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            matricula = acc.obtenerMatricula(matricula);
            modelo  = acc.obtenerModelo(matricula);
            color = acc.obtenerColor (matricula);
            ci_cliente = acc.obtenerCi_Cliente(matricula);
            request.setAttribute("txtMatricula", matricula);
            request.setAttribute("txtModelo", modelo);
            request.setAttribute("txtColor", color);
            request.setAttribute("txtCi_Cliente", ci_cliente);
            request.setAttribute("nivelA",2);
            rd=request.getRequestDispatcher("modificarVehiculo.jsp");
            rd.forward(request,response);
        }
    }

}