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

@WebServlet(name = "servAltaCliente")
public class servAltaCliente extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        boolean respues;
        try(PrintWriter out = response.getWriter()){
            String cedula;
            String password;
            String nombre;
            String apellido;
            String telefono;
            String direccion;
            String correo;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnAlta")!=null){
                cedula = request.getParameter("txtCedula");
                password = request.getParameter("txtPass");
                nombre = request.getParameter("txtNombre");
                apellido = request.getParameter("txtApellido");
                telefono = request.getParameter("txtTel");
                direccion = request.getParameter("txtDir");
                correo = request.getParameter("txtCorreo");
                respues = acc.altaCliente(cedula,password,nombre,apellido,telefono,direccion,correo);
                if(respues){
                    request.setAttribute("verdad",1);
                    rd=request.getRequestDispatcher("alta-cliente.jsp");
                }
                else{
                    request.setAttribute("verdad",0);
                    rd=request.getRequestDispatcher("alta-cliente.jsp");
                }
            }
            rd.forward(request,response);
        }
    }

}