package org.wso2.msf4j.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by senura on 8/7/2016.
 */



@Path("/DB")
public class DbService {


    @GET
    @Path("/{name}")
    public String hello(@PathParam("name") String name) {
        System.out.println("Hello");
        return "Db " + name;
    }
}