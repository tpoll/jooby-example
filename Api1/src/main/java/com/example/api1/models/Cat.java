package com.example.api1.models;

public class Cat implements  Pet{
  @Override
  public String getType() {
    return "CAT";
  }

  public String specialProgCat;
}
