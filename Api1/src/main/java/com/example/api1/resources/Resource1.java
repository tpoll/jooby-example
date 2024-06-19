package com.example.api1.resources;


import com.example.api1.models.RequestBody;
import io.jooby.annotation.GET;
import io.jooby.annotation.POST;
import io.jooby.annotation.Path;

@Path("/mvc")
public class Resource1 {

  @POST
  public String sayHi(RequestBody requestBody) {
    return "Hello Mvc!";
  }
}
