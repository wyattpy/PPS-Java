package servlets;

import clases.acceso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SERVALTA")
public class SERVALTA extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int respues = 9;
        try(PrintWriter out = response.getWriter()){
            String cedula;
            String password;
            String nombre;
            String apellido;
            String telefono;
            String direccion;
            String correo;
            acceso acc = new acceso();
            RequestDispatcher rd = null;
            if(request.getParameter("btnAlta")!=null){
                cedula = request.getParameter("txtCedula");
                if(acc.cedulaRepetida(cedula)){
                    request.setAttribute("verdad",0);
                    rd=request.getRequestDispatcher("alta.jsp");
                }
                password = request.getParameter("txtPass");
                nombre = request.getParameter("txtNombre");
                apellido = request.getParameter("txtApellido");
                telefono = request.getParameter("txtTel");
                direccion = request.getParameter("txtDir");
                correo = request.getParameter("txtCorreo");
                respues = acc.altaCliente(cedula,password,nombre,apellido,telefono,direccion,correo);
                request.setAttribute("verdad",1);
                rd=request.getRequestDispatcher("alta.jsp");
            }
            rd.forward(request,response);
        }
    }

}