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

@WebServlet(name = "servAltaContratoCli")
public class servAltaContratoCli extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnAlta")!=null){
                int idCliente = Integer.parseInt(request.getParameter("txtCedula"));
                int totalContrato;
                Date fechaInicio = Date.valueOf(request.getParameter("txtFechaInicio"));
                Date fechaFin = Date.valueOf(request.getParameter("txtFechaFin"));
                String tipoContrato = request.getParameter("plan");
                if(tipoContrato.equals("Premium")){
                    totalContrato = 400000;
                }
                else
                    totalContrato = 15000000;
                i = acc.altaContrato(idCliente,totalContrato,fechaInicio,fechaFin,"","Pendiente",tipoContrato);
                if(i!=0){
                    request.setAttribute("verd",0);
                }
                else
                    request.setAttribute("verdfal",0);
            }
            rd=request.getRequestDispatcher("nuevocontrato.jsp");
            rd.forward(request,response);
        }
    }
}
