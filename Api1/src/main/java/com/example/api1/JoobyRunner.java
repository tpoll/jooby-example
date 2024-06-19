package com.example.api1;

import io.jooby.Jooby;

import java.util.ArrayList;
import java.util.List;

public class JoobyRunner {

  private final List<Object> resourcesToBind;

  public static JoobyRunner create(String[] args) {
    return new JoobyRunner(args);
  }

  JoobyRunner(String[] args) {
    this.resourcesToBind = new ArrayList<>();
  }

  public JoobyRunner bindResource(Object resource) {
    resourcesToBind.add(resource);
    return this;
  }


  public void run() {
    Jooby jooby = new Jooby();
    bindResources(jooby);
    // this call doesn't block FYI
    Jooby.runApp(new String[] {}, () -> jooby);
  }

  private void bindResources(Jooby jooby) {
    for (Object resource : resourcesToBind) {
      jooby.mvc(resource);
    }
  }
}
