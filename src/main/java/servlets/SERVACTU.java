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

@WebServlet(name = "SERVACTU")
public class SERVACTU extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int respues = 9;
        try(PrintWriter out = response.getWriter()){
            String cedula = request.getParameter("txtCedula");
            String nombre = request.getParameter("txtNombre");
            String apellido = request.getParameter("txtApellido");
            String telefono = request.getParameter("txtTel");
            String direccion = request.getParameter("txtDir");
            String correo = request.getParameter("txtCorreo");
            String contrasena = request.getParameter("txtContrasena");
            acceso acc = new acceso() ;
            RequestDispatcher rd = null;
            if(request.getParameter("btnBuscar")!=null){
                request.setAttribute("txtNombre", nombre);
                request.setAttribute("txtApellido", apellido);
                request.setAttribute("txtTel", telefono);
                request.setAttribute("txtDir", direccion);
                request.setAttribute("txtCorreo", correo);
                request.setAttribute("txtPass", contrasena);
                acc.actualizarDatos(contrasena,nombre,apellido,telefono,direccion,correo);
                rd=request.getRequestDispatcher("datosCliente.jsp");
            }
            rd.forward(request,response);
        }
    }

}
