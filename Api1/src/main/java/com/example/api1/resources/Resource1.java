package com.example.api1.resources;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

@Path("/mvc")
public class Resource1 {

  @GET
  public String sayHi() {
    return "Hello Mvc!";
  }
}
