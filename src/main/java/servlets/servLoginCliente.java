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
            String cedula,apellido;
            String pass;
            String nombre;
            String idcontrato, total, fechaini, fechafin, estado, tipo, observaciones;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnLogin")!=null){
                cedula = request.getParameter("txtCedula");
                pass = request.getParameter("txtPass");
                nombre = acc.validarCli(cedula, pass);
                apellido = acc.obtenerApellido(cedula);
                idcontrato = acc.obtenerIdContrato(cedula);
                total = acc.obtenerTotalContrato(cedula);
                fechaini = acc.obtenerFechaInicio(cedula);
                fechafin = acc.obtenerFechaFin(cedula);
                estado = acc.obtenerEstadoContrato(cedula);
                tipo = acc.obtenerTipoContrato(cedula);
                observaciones = acc.obtenerDescripcion(cedula);
                request.setAttribute("nombre", nombre);
                request.setAttribute("apellido", apellido);
                request.setAttribute("cedula",cedula);
                request.setAttribute("pass",pass);
                request.setAttribute("telefono",acc.obtenerTelefono(cedula));
                request.setAttribute("direccion",acc.obtenerDireccion(cedula));
                request.setAttribute("correo",acc.obtenerCorreo(cedula));
                request.setAttribute("idcontrato",idcontrato);
                request.setAttribute("total",total);
                request.setAttribute("fechaini",fechaini);
                request.setAttribute("fechafin",fechafin);
                request.setAttribute("estado",estado);
                request.setAttribute("tipo",tipo);
                request.setAttribute("observaciones",observaciones);
            }
            rd=request.getRequestDispatcher("acceso.jsp");
            rd.forward(request,response);
        }
    }
}
