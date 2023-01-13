package com.example.api1.resources;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

@Path("example-1")
public class Resource2 {

  @GET
  public String example1() {
    return "Hello Mvc!";
  }
}
