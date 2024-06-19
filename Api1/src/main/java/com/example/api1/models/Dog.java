package com.example.api1.models;

public class Dog implements Pet{
  @Override
  public String getType() {
    return "DOG";
  }

  public String getMySpecialPropDog;
}
