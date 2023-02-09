package com.example.apachecorekafka;

import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApachecorekafkaApplication {

  public static void main(String[] args) {
    //ApachecorekafkaApplication apachecorekafkaApplication=new ApachecorekafkaApplication();
    //var applicationContext = new AnnotationConfigApplicationContext(Config1.class);
    //MyProducer myProducer= (MyProducer) applicationContext.getBean("myProducers");
    //myProducer.sends();
    //MyConsumer myConsumer = (MyConsumer) applicationContext.getBean("myConsumer");
    //myConsumer.consumes();

  //  SpringApplication.run(ApachecorekafkaApplication.class, args);
    var applicationContext = new AnnotationConfigApplicationContext(Config1.class);
    MyDependent myDependent = (MyDependent) applicationContext.getBean("myDependent");
  My m = BeanFactoryAnnotationUtils.qualifiedBeanOfType(applicationContext.getBeanFactory(), My.class, "my");

    //System.out.println(m.name);
    System.out.println(myDependent.miness.name);
  }

}
