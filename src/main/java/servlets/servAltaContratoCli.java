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
import java.sql.Date;
import java.util.Calendar;

@WebServlet(name = "servAltaContratoCli")
public class servAltaContratoCli extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnAlta")!=null){
                String cedula = request.getParameter("txtCedula");
                String totalContrato = request.getParameter("txtPrecio");
                String fechaInicio = request.getParameter("txtFechaInicio");
                String tipoContrato = request.getParameter("txtTipoContrato");
                String descripcion = "nuevo";
                String estado = "pendiente";
                i = acc.altaContratoCli(cedula,totalContrato,fechaInicio,descripcion,estado,tipoContrato);
                if(i!=0){
                    request.setAttribute("contratook",0);
                }
                else
                    request.setAttribute("contratono",0);
            }
            rd=request.getRequestDispatcher("menu.jsp");
            rd.forward(request,response);
        }
    }
}
