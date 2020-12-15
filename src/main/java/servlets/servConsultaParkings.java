package servlets;
import clases.PisosEntity;
import clases.accionesDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "servConsultaParkings")
public class servConsultaParkings extends HttpServlet{
    protected void processRequest(HttpServletRequest request,
                                  HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            accionesDB acc = new accionesDB();
            ArrayList<PisosEntity> piso = new ArrayList<>();
            piso.add(new PisosEntity((short) 1, 50, false));
            piso.add(new PisosEntity((short) 2, 50, false));
            piso.add(new PisosEntity((short) 3, 50, false));

            // Setting the attribute of the request object
            // which will be later fetched by a JSP page
            request.setAttribute("pisos", piso);

            // Creating a RequestDispatcher object to dispatch
            // the request the request to another resource
            RequestDispatcher rd =
                    request.getRequestDispatcher("stdlist.jsp");

            // The request will be forwarded to the resource
            // specified, here the resource is a JSP named,
            // "stdlist.jsp"
            rd.forward(request, response);
            out.println("</body>");
            out.println("</html>");
        }
    }
}
