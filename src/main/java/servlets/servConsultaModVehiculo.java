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

@WebServlet(name = "servConsultaModVehiculo")
public class servConsultaModVehiculo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String matricula, marca, modelo, color, cliente;
            accionesDB acc = new accionesDB();
            RequestDispatcher rd = null;
            if(request.getParameter("btnBuscar")!=null){
                matricula = request.getParameter("txtMatricula");
                marca = acc.obtenerMarca(matricula);
                modelo = acc.obtenerModelo(matricula);
                color = acc.obtenerColor(matricula);
                cliente = acc.obtenerCiCliente(matricula);
                request.setAttribute("matricula", matricula);
                request.setAttribute("marca", marca);
                request.setAttribute("modelo", modelo);
                request.setAttribute("color", color);
                request.setAttribute("cliente", cliente);
                rd=request.getRequestDispatcher("datosmodvehiculo.jsp");
            }
            rd.forward(request,response);
        }
    }

}