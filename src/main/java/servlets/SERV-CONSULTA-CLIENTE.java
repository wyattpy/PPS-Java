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

@WebServlet(name = "SERVCONSULTACLIENTE")
public class SERVCONSULTACLIENTE extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String cedula, contrasena, nombre, apellido, telefono, direccion, correo;
            acceso acc = new acceso();
            RequestDispatcher rd = null;
            if(request.getParameter("btnBuscar")!=null){
                cedula = request.getParameter("txtCedula");
                nombre = acc.obtenerNombre(cedula);
                contrasena = acc.obtenerContrasena(cedula);
                apellido = acc.obtenerApellido(cedula);
                telefono = acc.obtenerTelefono(cedula);
                direccion = acc.obtenerDireccion(cedula);
                correo = acc.obtenerCorreo(cedula);
                request.setAttribute("nombre", nombre);
                request.setAttribute("cedula", cedula);
                request.setAttribute("contraseña", contrasena);
                request.setAttribute("apellido", apellido);
                request.setAttribute("telefono", telefono);
                request.setAttribute("direccion", direccion);
                request.setAttribute("correo", correo);
                rd=request.getRequestDispatcher("datosCliente.jsp");
            }
            rd.forward(request,response);
        }
    }

}