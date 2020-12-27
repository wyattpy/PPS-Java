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

@WebServlet(name = "servActualizarParking")
public class servActualizarParking extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnMod")!=null){
                String nro_piso = request.getParameter("txtNroPiso");
                String lugares_disponibles = request.getParameter("txtLugaresDisponibles");
                String lleno = request.getParameter("txtLleno");
                i =  acc.actualizarDatosParking( nro_piso, lugares_disponibles,  lleno);
                if(i!=0){
                    request.setAttribute("modok", 0);
                }
                else{
                    request.setAttribute("modono", 0);
                }
            }
            rd=request.getRequestDispatcher("menubusqueda5.jsp");
            rd.forward(request,response);
        }
    }

}

