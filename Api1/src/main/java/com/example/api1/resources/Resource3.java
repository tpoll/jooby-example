package com.example.api1.resources;


import io.jooby.annotation.GET;
import io.jooby.annotation.Path;

@Path("example-3")
public class Resource3 {

  @GET
  public String example3() {
    return "Hello Mvc!";
  }
}
