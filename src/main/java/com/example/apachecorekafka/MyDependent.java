package com.example.apachecorekafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyDependent {

  @Autowired

  @Qualifier("me")
  My miness;

  public void mines()
{
  System.out.println("hello");
}
}
