package com.example.api1;

import com.example.JoobyRunner;
import com.example.api1.resources.Resource1;
import com.example.api1.resources.Resource2;

public class Api1 {
  public static void main(String[] args) {
    JoobyRunner.create(args)
      .bindResource(new Resource1())
      .bindResource(new Resource2())
      .run();
  }
}
