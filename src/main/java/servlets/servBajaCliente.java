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

@WebServlet(name = "servBajaCliente")
public class servBajaCliente extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int i;
        try (PrintWriter out = response.getWriter()) {
            String cedula;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if (request.getParameter("btnEliminar") != null) {
                cedula = request.getParameter("txtCedula");
                i = acc.bajaCliente(cedula);
                if (i != 0) {
                    request.setAttribute("bajaok", 0);
                }
            }
            rd = request.getRequestDispatcher("bajacliente.jsp");
            rd.forward(request, response);
        }
    }
}
