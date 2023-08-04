package com.example.api1.resources;


import io.jooby.annotation.GET;
import io.jooby.annotation.Path;

@Path("example-1")
public class Resource2 {

  @GET
  public String example1() {
    return "Hello Mvc!";
  }
}
