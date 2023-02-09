/*
package com.example.apachecorekafka;

import org.apache.kafka.clients.consumer.MockConsumer;
import org.apache.kafka.clients.consumer.OffsetResetStrategy;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.MockProducer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class ApachecorekafkaApplicationTests {

	@Test
	void producer() {

		MockProducer mockProducer = new MockProducer<>(true, new StringSerializer(), new StringSerializer());
		MyProducer myProducer = new MyProducer();
		My my=new My();
		myProducer.my=my;
		myProducer.producer=mockProducer;
		myProducer.sends();

	}
	@Test
	void co() {

		MockConsumer mockConsumer = new MockConsumer<>(OffsetResetStrategy.EARLIEST);
		MyConsumer myConsumer = new MyConsumer();
		myConsumer.consumer=mockConsumer;
		myConsumer.consumes();

	}

}
*/
