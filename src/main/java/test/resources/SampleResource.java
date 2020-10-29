package test.resources;

import org.glassfish.jersey.server.mvc.Viewable;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class SampleResource {

    @GET
    @Path("")
    public Viewable index() {
        return new Viewable("/index.html");
    }

    @GET
    @Path("/login")
    public Viewable login() {
        return new Viewable("/login.jsp");
    }

    @GET
    @Path("/registro")
    public Viewable registro() {
        return new Viewable("/registro.jsp");
    }
}


