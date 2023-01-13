package com.example.api1;

import com.example.api1.resources.Resource1;
import com.example.api1.resources.Resource2;
import io.jooby.ExecutionMode;
import io.jooby.Jooby;

public class Api1 {
    public static void main(String[] args) {
      Jooby jooby = new Jooby();

      jooby.mvc(new Resource1());
      jooby.mvc(new Resource2());
      jooby.setExecutionMode(ExecutionMode.WORKER);

      Jooby.runApp(args, () -> jooby);
    }
}
