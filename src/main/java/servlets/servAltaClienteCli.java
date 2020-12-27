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
                String password2 = request.getParameter("txtPass2");
                String nombre = request.getParameter("txtNombre");
                String apellido = request.getParameter("txtApellido");
                String telefono = request.getParameter("txtTel");
                String direccion = request.getParameter("txtDir");
                String correo = request.getParameter("txtCorreo");
                i = acc.altaClienteCli(cedula,password,password2,nombre,apellido,telefono,direccion,correo);
                request.setAttribute("nombre",nombre);
                request.setAttribute("apellido",apellido);
                request.setAttribute("cedula",cedula);
                request.setAttribute("pass",password);
                request.setAttribute("telefono",acc.obtenerTelefono(cedula));
                request.setAttribute("direccion",acc.obtenerDireccion(cedula));
                request.setAttribute("correo",acc.obtenerCorreo(cedula));
                if(i==99){
                    request.setAttribute("registrodu",0);
                }
                else
                    if(i==1) {
                        request.setAttribute("registrook", 0);
                    }
                    else{
                        request.setAttribute("registrono", 0);
                    }
            }
            rd=request.getRequestDispatcher("registro.jsp");
            rd.forward(request,response);
        }
    }
}