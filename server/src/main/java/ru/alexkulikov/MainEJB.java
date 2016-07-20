package ru.alexkulikov;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
@Stateless
public class MainEJB {

    @Path("/echo")
    @GET
    public Response doEcho() {
        return Response.ok("HELLO WORLD!").build();
    }
}
