package com.driver;

public class Main {
  public static void main(String [] args){
      RWOnly r1 = new RWOnly();

      //r1.name("John")  this will cause compilation error because name is private variable
     // System.out.println(r1.name());

      r1.setName("John");
      System.out.println(r1.getName());


  }
}