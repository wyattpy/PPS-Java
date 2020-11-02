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
            String cedula;
            String nombre;
            String apellido;
            String telefono;
            String direccion;
            String correo;
            String cotrasena;
            acceso acc = new acceso();
            RequestDispatcher rd = null;
            if(request.getParameter("btnBuscar")!=null){
                cedula = request.getParameter("txtCedula");
                request.setAttribute("nombre",acc.obtenerNombre(cedula));
                request.setAttribute("apellido",acc.obtenerApellido(cedula));
                request.setAttribute("telefono",acc.obtenerTelefono(cedula));
                request.setAttribute("direccion",acc.obtenerDireccion(cedula));
                request.setAttribute("correo",acc.obtenerCorreo(cedula));
                request.setAttribute("contrasena",acc.obtenerContrasena(cedula));
                rd=request.getRequestDispatcher("datosCliente.jsp");
            }
            rd.forward(request,response);
        }
    }

}