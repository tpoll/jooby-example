package com.example.api1.resources;


import io.jooby.annotation.GET;
import io.jooby.annotation.Path;

@Path("/mvc")
public class Resource1 {

  @GET
  public String sayHi() {
    return "Hello Mvc!";
  }
}
