package com.example.api_2.resources;


import io.jooby.annotation.GET;
import io.jooby.annotation.Path;

@Path("/example-2")
public class Resource1 {

  @GET
  public String example2() {
    return "Hello Mvc!";
  }
}
