package com.example.api_2.resources;


import io.jooby.annotation.GET;
import io.jooby.annotation.Path;

@Path("/mvc-2")
public class Resource2 {

  @GET
  public String sayHi() {
    return "Hello Mvc!";
  }
}
