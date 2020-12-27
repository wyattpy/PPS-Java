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

@WebServlet(name = "servConsultaModContrato")
public class servConsultaModContrato extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String cedula, idContrato, total, fechainicio, fechafin, estado, tipo, observaciones;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnBuscar")!=null){
                cedula = request.getParameter("txtCedula");
                idContrato = acc.obtenerIdContrato(cedula);
                total = acc.obtenerTotalContrato(cedula);
                fechainicio = acc.obtenerFechaInicio(cedula);
                fechafin = acc.obtenerFechaFin(cedula);
                estado = acc.obtenerEstadoContrato(cedula);
                tipo = acc.obtenerTipoContrato(cedula);
                observaciones = acc.obtenerDescripcion(cedula);
                request.setAttribute("idContrato", idContrato);
                request.setAttribute("cedula", cedula);
                request.setAttribute("total", total);
                request.setAttribute("fechaini", fechainicio);
                request.setAttribute("fechafin", fechafin);
                request.setAttribute("estado", estado);
                request.setAttribute("tipo", tipo);
                request.setAttribute("observaciones", observaciones);
            }
            rd=request.getRequestDispatcher("datosmodcontrato.jsp");
            rd.forward(request,response);
        }
    }

}
