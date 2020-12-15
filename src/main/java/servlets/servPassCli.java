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

@WebServlet(name = "servPassCli")
public class servPassCli extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            String cedula = request.getParameter("txtCedula");
            String contrasena = request.getParameter("txtPass");
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnMod")!=null){
                i = acc.actualizarContraCliente(cedula,contrasena);
                if(i!=0){
                    request.setAttribute("passCh", 0);
                }
                else
                    request.setAttribute("passCh1", 0);
            }
            rd=request.getRequestDispatcher("passcliente.jsp");
            rd.forward(request,response);
        }
    }

}
