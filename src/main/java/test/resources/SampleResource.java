package test.resources;

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
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
    @Produces(MediaType.TEXT_HTML)
    public String showLogin() {
        String content = "";
        try {
            URL url = Resources.getResource("login.html");
            content = Resources.toString(url, StandardCharsets.UTF_8);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return content;
    }
    @GET
    @Path("/registro")
    @Produces(MediaType.TEXT_HTML)
    public String showRegistro() {
        String content = "";
        try {
            URL url = Resources.getResource("registro.html");
            content = Resources.toString(url, StandardCharsets.UTF_8);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return content;
    }

    @POST
    @Path("/servlet1")
    public String showNivel() {
        String content = "";
        try {
            URL url = Resources.getResource("servlet1.java");
            content = Resources.toString(url, StandardCharsets.UTF_8);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return content;
    }

}




