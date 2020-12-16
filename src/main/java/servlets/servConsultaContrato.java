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
            String id_contrato, id_cliente, total_contrato, fecha_inicio, fecha_fin, descripcion, estado, tipo_contrato;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnBuscar")!=null){
                id_contrato = request.getParameter("txtContrato");
                id_cliente = acc.obtenerIdCliente(id_contrato);
                total_contrato = acc.obtenerTotalContrato(id_contrato);
                fecha_inicio = acc.obtenerFechaInicio(id_contrato);
                fecha_fin = acc.obtenerFechaFin(id_contrato);
                descripcion = acc.obtenerDescripcion(id_contrato);
                estado = acc.obtenerCorreo(id_contrato);
                tipo_contrato= acc. obtenerEstadoContrato(id_contrato);
                request.setAttribute("id_cliente", id_cliente);
                request.setAttribute("total_contrato", total_contrato);
                request.setAttribute("fecha_inicio", fecha_inicio);
                request.setAttribute("fecha_fin", fecha_fin);
                request.setAttribute("descripcion", descripcion);
                request.setAttribute("estado", estado);
                request.setAttribute("tipo_contrato", tipo_contrato);
            }
            rd=request.getRequestDispatcher("datosconsultacontrato.jsp");
            rd.forward(request,response);
        }
    }

}

