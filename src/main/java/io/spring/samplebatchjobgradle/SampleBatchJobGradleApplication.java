package io.spring.samplebatchjobgradle;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableBatchProcessing
public class SampleBatchJobGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleBatchJobGradleApplication.class, args);
	}
}
