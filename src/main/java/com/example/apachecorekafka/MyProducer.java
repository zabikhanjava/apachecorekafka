package com.example.apachecorekafka;

import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Service
public class MyProducer {

  KafkaProducer<String, String> kafkaProducer;
  @Autowired
  Producer<String, String> producer;

  @Autowired
  My my;

  public void sends() {
    my.mine();

    ProducerRecord<String, String> record = new ProducerRecord<String, String>("topic1","90", "message");

    producer.send(record);
    // kafkaProducer.send(record);
    //  kafkaProducer.flush();
    // kafkaProducer.close();
  }
}
