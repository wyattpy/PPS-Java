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

@WebServlet(name = "servActualizameCli")
public class servActualizameCli extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnMod")!=null){
                String cedula = request.getParameter("txtCedula");
                String telefono = request.getParameter("txtTel");
                String direccion = request.getParameter("txtDir");
                String correo = request.getParameter("txtCorreo");
                String contrasena = request.getParameter("txtContrasena");
                i = acc.actualizarDatosCli(contrasena,telefono,direccion,correo,cedula);
                if(i!=0){
                    request.setAttribute("modok", 0);
                }
                else{
                    request.setAttribute("modno", 0);
                }
            }
            rd=request.getRequestDispatcher("micuenta.jsp");
            rd.forward(request,response);
        }
    }

}