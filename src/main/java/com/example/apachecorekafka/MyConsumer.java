
package com.example.apachecorekafka;

import java.time.Duration;
import java.util.Arrays;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

//@Service
public class MyConsumer {

  //KafkaConsumer<String, String> kafkaConsumer;

  Consumer<String, String> consumer;

  @Autowired
  MyConsumer(Consumer consumer) {
    this.consumer = consumer;
  } MyConsumer() {
    this.consumer = consumer;
  }

  public void consumes() {
    System.out.println("manzoor");
    consumer.subscribe(Arrays.asList("topic1"));
    while (true) {
      ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
      for (ConsumerRecord<String, String> record : records) {
        System.out.println("key" + record.key());
        System.out.println("topic" + record.topic());
        System.out.println("partition" + record.partition());
        System.out.println("value" + record.value());
      }
    }
  }
}
