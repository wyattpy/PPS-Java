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

@WebServlet(name = "servLoginCliente")
public class servLoginCliente extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String cedula,cuenta,apellido;
            String pass;
            String nombre = "0";
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnLogin")!=null){
                cedula = request.getParameter("txtCedula");
                pass = request.getParameter("txtPass");
                nombre = acc.validarCli(cedula, pass);
                apellido = acc.obtenerApellido(cedula);
                cuenta = acc.obtenerTipoCuenta(cedula);
                request.setAttribute("nombre", nombre);
                request.setAttribute("cedula", cedula);
                request.setAttribute("cuenta", cuenta);
                request.setAttribute("apellido", apellido);
            }
            rd=request.getRequestDispatcher("acceso.jsp");
            rd.forward(request,response);
        }
    }
}
