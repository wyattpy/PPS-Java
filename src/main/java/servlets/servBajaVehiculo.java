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

@WebServlet(name = "servBajaVehiculo")
public class servBajaVehiculo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int respues = 9;
        try(PrintWriter out = response.getWriter()){
            String matricula;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnEliminar")!=null){
                matricula = request.getParameter("txtmatricula");
                respues = acc.bajaVehiculo(matricula);
                if(respues == 1){
                    request.setAttribute("verdad1",1);
                    rd=request.getRequestDispatcher("baja-vehiculo.jsp");
                }
                request.setAttribute("verdad1",0);
                rd=request.getRequestDispatcher("baja-vehiculo.jsp");
            }
            rd.forward(request,response);
        }
    }

}
