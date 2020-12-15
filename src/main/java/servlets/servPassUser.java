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

@WebServlet(name = "servPassUser")
public class servPassUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd;
            if(request.getParameter("btnMod")!=null){
                String cedula = request.getParameter("txtCedula");
                String contrasena = request.getParameter("txtContrasena");
                i = acc.actualizarContraUser(cedula,contrasena);
                if(i!=0){
                    request.setAttribute("verdcc", 0);
                }
            }
            rd=request.getRequestDispatcher("passuser.jsp");
            rd.forward(request,response);
        }
    }
}
