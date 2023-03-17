package com.example.consumingtest;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingTestApplication {
	public static final Logger log = LoggerFactory.getLogger(ConsumingTestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingTestApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			ChuckQuote quote = restTemplate.getForObject(
					"https://api.chucknorris.io/jokes/random", ChuckQuote.class);

			log.info(quote.value());
		};
	}*/

}
