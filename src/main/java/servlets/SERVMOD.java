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

@WebServlet(name = "SERVMOD")
public class SERVMOD extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int respues = 9;
        try(PrintWriter out = response.getWriter()){
            String cedula = request.getParameter("txtCedula");
            String nombre;
            String apellido;
            String telefono;
            String direccion;
            String correo;
            String contrasena;
            acceso acc = new acceso();
            RequestDispatcher rd = null;
            contrasena = acc.obtenerContrasena(cedula);
            nombre = acc.obtenerNombre(cedula);
            apellido = acc.obtenerApellido(cedula);
            telefono = acc.obtenerTelefono(cedula);
            direccion = acc.obtenerDireccion(cedula);
            correo = acc.obtenerCorreo(cedula);
            request.setAttribute("txtNombre", nombre);
            request.setAttribute("txtApellido", apellido);
            request.setAttribute("txtTel", telefono);
            request.setAttribute("txtDir", direccion);
            request.setAttribute("txtCorreo", correo);
            request.setAttribute("txtPass", contrasena);
            request.setAttribute("nivelA",1);
            rd=request.getRequestDispatcher("modificar.jsp");
            rd.forward(request,response);
        }
    }

}