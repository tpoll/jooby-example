package com.example.api1;

import com.example.api1.resources.Resource1;
import com.example.api1.resources.Resource2;
import io.jooby.annotation.OpenApiRegister;

@OpenApiRegister(value = {Resource1.class, Resource2.class})
public class Api1 {
  public static void main(String[] args) {
    JoobyRunner.create(args)
      .bindResource(new Resource1())
      .bindResource(new Resource2())
      .run();
  }
}
