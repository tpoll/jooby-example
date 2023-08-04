package com.example.api_2;

import com.example.JoobyRunner;
import com.example.api_2.resources.Resource1;
import com.example.api_2.resources.Resource2;

public class Api2 {
    public static void main(String[] args) {
      JoobyRunner.create(args)
        .bindResource(new Resource1())
        .bindResource(new Resource2())
        .run();
    }
}
