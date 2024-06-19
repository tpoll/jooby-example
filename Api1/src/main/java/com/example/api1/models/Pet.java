package com.example.api1.models;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.EXISTING_PROPERTY,
  property = "type"
)
@JsonSubTypes(
  {
    @JsonSubTypes.Type(value = Cat.class, name = "CAT"),
    @JsonSubTypes.Type(value = Dog.class, name = "DOG"),
  }
)
public interface Pet {
  String getType();
}
