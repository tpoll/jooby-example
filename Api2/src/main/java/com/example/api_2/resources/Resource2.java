package com.example.api_2.resources;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

@Path("/mvc-2")
public class Resource2 {

  @GET
  public String sayHi() {
    return "Hello Mvc!";
  }
}
