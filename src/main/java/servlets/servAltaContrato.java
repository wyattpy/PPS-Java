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
                String total_contrato = request.getParameter("txtPass");
                Date fecha_inicio = Date.valueOf(request.getParameter("txtNombre"));
                Date fecha_fin = Date.valueOf(request.getParameter("txtNombre"));
                String descripcion = request.getParameter("txtTel");
                String estado = request.getParameter("txtDir");
                String tipo_contrato = request.getParameter("txtCorreo");

            }
            rd=request.getRequestDispatcher("altacontrato.jsp");
            rd.forward(request,response);
        }
    }
}