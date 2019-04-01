package com.mentoring.springcloudkafkastreams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("config")
@ComponentScan("controller")
@ComponentScan("service")
@ComponentScan("stream")
@SpringBootApplication
public class SpringCloudKafkaStreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudKafkaStreamsApplication.class, args);
	}

}
