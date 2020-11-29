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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnMod")!=null){
                String color = request.getParameter("txtColor");
                String matricula = (String) request.getAttribute("txtMatricula");
                i = acc.actualizarDatosVehiculo(matricula,color);
                if(i != 0){
                    request.setAttribute("verdvvv", 0);
                }
            }
            rd=request.getRequestDispatcher("modificarvehiculo.jsp");
            rd.forward(request,response);
        }
    }

}