package org.mycompany.myproject;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


/**
 * Created by drew on 6/26/15.
 */
@Path("/foo")
public class FooResource {



    @Path("/bar")
    public Response doFoobar(){
        return Response.ok().entity("it works!").build();

    }







}
