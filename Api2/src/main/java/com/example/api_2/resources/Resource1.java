package com.example.api_2.resources;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

@Path("/example-2")
public class Resource1 {

  @GET
  public String example2() {
    return "Hello Mvc!";
  }
}
