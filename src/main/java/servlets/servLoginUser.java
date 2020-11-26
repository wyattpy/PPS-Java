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

@WebServlet(name = "servLoginUser")
public class servLoginUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String cedula;
            String pass;
            int nivel = 0;
            String nombre = "0";
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnLogin")!=null){
                cedula = request.getParameter("txtCedula");
                pass = request.getParameter("txtPass");
                nivel = acc.validar(cedula, pass);
                nombre = acc.obtenerNombre(cedula, pass);
                request.setAttribute("nivel", nivel);
                request.setAttribute("nombre", nombre);
                request.setAttribute("cedula", cedula);
                rd=request.getRequestDispatcher("login.jsp");
            }
            rd.forward(request,response);
        }
    }

}
