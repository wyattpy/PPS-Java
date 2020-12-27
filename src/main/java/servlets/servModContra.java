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

@WebServlet(name = "servModContra")
public class servModContra extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try(PrintWriter out = response.getWriter()){
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnMod")!=null){
                String pass = request.getParameter("txtPass");
                String user = request.getParameter("txtUser");
                i = acc.cambiarContraAdmin(pass,user);
                if(i!=0){
                    request.setAttribute("modconok", 0);
                }
                else{
                    request.setAttribute("modconno", 0);
                }
            }
            rd=request.getRequestDispatcher("modcontra.jsp");
            rd.forward(request,response);
        }
    }
}
