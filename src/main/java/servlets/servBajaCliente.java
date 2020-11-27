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

@WebServlet(name = "servBajaCliente")
public class servBajaCliente extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int respues = 9;
        try(PrintWriter out = response.getWriter()){
            String cedula;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnEliminar")!=null){
                cedula = request.getParameter("txtCedula");
                respues = acc.bajaCliente(cedula);
                if(respues == 1){
                    request.setAttribute("verdad1",1);
                    rd=request.getRequestDispatcher("baja-cliente.jsp");
                }
                request.setAttribute("verdad1",0);
                rd=request.getRequestDispatcher("baja-cliente.jsp");
            }
            rd.forward(request,response);
        }
    }

}
