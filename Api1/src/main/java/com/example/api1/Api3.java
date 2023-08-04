package com.example.api1;

import com.example.JoobyRunner;
import com.example.api1.resources.Resource3;

public class Api3 {
  public static void main(String[] args) {
    JoobyRunner.create(args)
      .bindResource(new Resource3())
      .run();
  }
}
