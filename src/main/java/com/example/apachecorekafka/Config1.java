package com.example.apachecorekafka;

import java.util.Properties;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.apachecorekafka")

public class Config1 {


  @Bean
  //@Qualifier("me")
  public My me() {
    System.out.println("me");
    My m = new My();
    m.name = "me";
    return m;
  }

  @Bean
  public My mine() {
    System.out.println("mine");
    My m = new My();
    m.name = "mine";
    return m;

  }

  @Bean
  public My my() {
    System.out.println("my");
    My m = new My();
    m.name = "my";
    return m;
  }
}
