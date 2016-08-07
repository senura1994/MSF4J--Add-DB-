/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.msf4j.example;




import javax.ws.rs.*;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.ArrayList;



/**
 * Hello service resource class.
 */
@Path("/hello")
public class HelloService {





    @GET
    @Path("/{name}")
    public String hello(@PathParam("name") String name) {
        System.out.println("Hello");
        return "Hello " + name;
    }


    @GET
    @Path("sss/{msg}")
    public String puttingdata(@PathParam("msg")String www){
        String sss=www;
        int id = 0 ;
        ArrayList<String> Names = new ArrayList<String>();
        for (int i=0 ;i<Names.size();i++ ){

            Names.add(id , sss);
            System.out.println("id"+ id +""+ "name" +sss);

        }


      // return "this is " + sss ;
    return "id" + id +"Name " + sss ;
    }
    // method 1 for get data from form
    @POST
    @Path("add")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.MULTIPART_FORM_DATA})
    public Response addStudent(@FormParam("Name") String Name, @FormParam("age") int age) {
       // System.out.println("Name " + Name);
        System.out.println("Age is blah blah" + age);

        String name =Name;
        int Age =age ;
        //System.out.println("Name " + name);
       /// System.out.println("Age" + Age);
       //return "has added" +""+name + "and" +Age ;



        return Response.ok(200).entity("Name and age " + name + ", " + Age).build();

    }
    //method 2 for get data * String type*
    @POST
    @Path("ToServer")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED, MediaType.MULTIPART_FORM_DATA})
    public String addStudent(@FormParam("Name") String Name) {
       System.out.println("Name " + Name);


        String name =Name;




        return "has added" +"" +name ;
        // return Response.ok(200).entity("Name  " + name ).build();

    }









}
