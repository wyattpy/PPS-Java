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

@WebServlet(name = "servAltaContrato")
public class servAltaContrato extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnAlta")!=null){
                String id_cliente = request.getParameter("txtCedula");
                String total_contrato = request.getParameter("txtTotalContrato");
                String fecha_inicio = request.getParameter("txtFechaInicio");
                String fecha_fin = request.getParameter("txtFechaFin");
                String descripcion = request.getParameter("txtDescripcion");
                String estado = request.getParameter("txtEstado");
                String tipo_contrato = request.getParameter("txtTipoContrato");
                i = acc.altaContrato(id_cliente,total_contrato,fecha_inicio,fecha_fin,descripcion,estado,tipo_contrato);
                if(i!=0){
                    request.setAttribute("contratok",0);
                }
                else
                    request.setAttribute("contratno",0);
            }
            rd=request.getRequestDispatcher("altaContrato.jsp");
            rd.forward(request,response);
        }
    }
}