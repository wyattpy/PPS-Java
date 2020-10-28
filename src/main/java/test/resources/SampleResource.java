package test.resources;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class SampleResource {

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_HTML)
    public String showHellowWorld() {
        String content = "";
        try {
            URL url = Resources.getResource("index.html");
            content = Resources.toString(url, StandardCharsets.UTF_8);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return content;
    }

    @GET
    @Path("/login")
    public Viewable index(
            @Context HttpServletRequest request,
            @Context HttpServletResponse response) throws Exception
    {
        request.setAttribute("key", "value");
        return new Viewable("login.jsp", null);
    }


    @GET
    @Path("/registro")
    public Viewable index(
            @Context HttpServletRequest request,
            @Context HttpServletResponse response) throws Exception
    {
        request.setAttribute("key", "value");
        return new Viewable("registro.jsp", null);
    }

}



