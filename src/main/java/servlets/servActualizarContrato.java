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

@WebServlet(name = "servActualizarContrato")
public class servActualizarContrato extends HttpServlet{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnMod")!=null){
                String id_contrato = request.getParameter("txtIdContrato");
                String id_cliente = request.getParameter("txtCedula");
                String total_contrato = request.getParameter("txtTotal");
                String fecha_inicio = request.getParameter("txtFechaIni");
                String fecha_fin = request.getParameter("txtFechaFin");
                String descripcion = request.getParameter("txtObservaciones");
                String estado = request.getParameter("txtEstado");
                String tipo_contrato = request.getParameter("txtTipo");
                i = acc.actualizarDatosContrato(id_contrato,total_contrato,fecha_inicio,fecha_fin,descripcion,estado,tipo_contrato);
                if(i!=0){
                    request.setAttribute("modok", 0);
                }
                else
                    request.setAttribute("modno", 0);
            }
            rd=request.getRequestDispatcher("modificarcontrato.jsp");
            rd.forward(request,response);
        }
    }
}
