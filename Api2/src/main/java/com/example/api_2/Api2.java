package com.example.api_2;

import com.example.api_2.resources.Resource1;
import com.example.api_2.resources.Resource2;
import io.jooby.ExecutionMode;
import io.jooby.Jooby;

public class Api2 {
    public static void main(String[] args) {
      Jooby jooby = new Jooby();

      jooby.mvc(new Resource2());
      jooby.mvc(new Resource1());
      jooby.setExecutionMode(ExecutionMode.WORKER);

      Jooby.runApp(args, () -> jooby);
    }
}
