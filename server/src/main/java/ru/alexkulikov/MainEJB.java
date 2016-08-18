package ru.alexkulikov;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/")
@Stateless
public class MainEJB {

    @PersistenceContext
    private EntityManager entityManager;

    @Path("/save")
    @POST
    public Response doSave(@FormParam("value") String value) {
        SomeEntity entity = new SomeEntity(value);
        entityManager.persist(entity);

        return Response.ok(String.valueOf(entity.getId())).build();
    }

    @Path("/echo")
    @GET
    public Response doEcho(@QueryParam("id") Long id) {
        SomeEntity entity = entityManager.find(SomeEntity.class, id);
        return Response.ok(entity.getValue()).build();
    }
}
