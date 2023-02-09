package com.example.apachecorekafka;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StaticMain extends StaticParent{

  public static void main(String[] args) {
    StaticParent sta;
    StaticMain ss= new StaticMain();
    sta=ss;
    ss.hello();
  }
  static void hello() {
    System.out.println("StaticMain");
  }
}

class StaticParent {
  static void hello() {
    System.out.println("hello g1");
  }
}