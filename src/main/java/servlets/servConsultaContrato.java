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


@WebServlet(name = "servConsultaContrato")
public class servConsultaContrato extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnBuscar")!=null){
                String cedula = request.getParameter("txtCedula");
                String total = acc.obtenerTotalContrato(cedula);
                if(total==null){
                    request.setAttribute("nocontratos",0);
                }
                String idcontrato = acc.obtenerIdContrato(cedula);
                String fechainicio = acc.obtenerFechaInicio(cedula);
                String fechafin = acc.obtenerFechaFin(cedula);
                String estado = acc.obtenerEstadoContrato(cedula);
                String tipo = acc.obtenerTipoContrato(cedula);
                String observaciones = acc.obtenerDescripcion(cedula);
                request.setAttribute("idContrato", idcontrato);
                request.setAttribute("cedula", cedula);
                request.setAttribute("total", total);
                request.setAttribute("fechaini", fechainicio);
                request.setAttribute("fechafin", fechafin);
                request.setAttribute("estado", estado);
                request.setAttribute("tipo", tipo);
                request.setAttribute("observaciones", observaciones);
            }
            rd=request.getRequestDispatcher("datosconsultacontrato.jsp");
            rd.forward(request,response);
        }
    }

}

