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

    @POST
    @Path("/login")
    public Response login(@Context ServletContext context) {
        UriBuilder uriBuilder = UriBuilder.fromUri(URI.create(context.getContextPath()));
        uriBuilder.path(login.jsp);
        URI uri = uriBuilder.build();

        return Response.seeOther(uri).build();
    }


    @POST
    @Path("/registro")
    public Response login(@Context ServletContext context) {
        UriBuilder uriBuilder = UriBuilder.fromUri(URI.create(context.getContextPath()));
        uriBuilder.path(registro.jsp);
        URI uri = uriBuilder.build();

        return Response.seeOther(uri).build();
    }

}



