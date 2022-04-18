package com.sumeet.webservices.restiapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sumeet.webservice"})
public class RestiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestiApiApplication.class, args);
	}

}
