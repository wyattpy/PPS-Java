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

@WebServlet(name=  "servConsultaModParking")
public class servConsultaModParking extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String nro_piso, lugares_disponibles, lleno ;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnBuscar")!=null){
                nro_piso = request.getParameter("txtNroPiso");
                lugares_disponibles = acc.obtenerLugaresDisponibles(nro_piso);
                lleno = acc.obtenerLleno(nro_piso);

                request.setAttribute("nro_piso", nro_piso);
                request.setAttribute("lugares_disponibles", lugares_disponibles);
                request.setAttribute("lleno", lleno);

            }
            rd=request.getRequestDispatcher("datosmodparking.jsp");
            rd.forward(request,response);
        }
    }

}
