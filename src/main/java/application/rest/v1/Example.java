package application.rest.v1;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.ArrayList;


@Path("v1/example")
public class Example {



    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response example() {
        List<String> list = new ArrayList<>();
        //return a simple list of strings
        list.add("Congratulations Microclimate User, your Java application built with IBM Microclimate is up and running. Use the <hosname:port/v1/example URL to test");
        return Response.ok(list.toString()).build();
    }


}
