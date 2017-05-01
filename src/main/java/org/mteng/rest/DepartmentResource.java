package org.mteng.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/api/v1")
public class DepartmentResource {

  @GET
  @Path("/hello")
  public String hello() {
    return "Hello World";
  }

}