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

@WebServlet(name = "servAltaClienteCli")
public class servAltaClienteCli extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        String a=request.getParameter("txtPass"), b=request.getParameter("txtPass2");
        if(!a.equals(b)){
            RequestDispatcher rd = null;
            request.setAttribute("iguales",0);
            rd=request.getRequestDispatcher("registro.jsp");
            rd.forward(request,response);
        }
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnAlta")!=null){
                String cedula = request.getParameter("txtCedula");
                String password = request.getParameter("txtPass");
                String nombre = request.getParameter("txtNombre");
                String apellido = request.getParameter("txtApellido");
                String telefono = request.getParameter("txtTel");
                String direccion = request.getParameter("txtDir");
                String correo = request.getParameter("txtCorreo");
                i = acc.altaCliente(cedula,password,nombre,apellido,telefono,direccion,correo);
                if(i!=1){
                    request.setAttribute("verd",0);
                }
                else
                    request.setAttribute("alt",0);
            }
            rd=request.getRequestDispatcher("registro.jsp");
            rd.forward(request,response);
        }
    }
}