package com.lic.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.lic.starter"})
public class LicApplication {

	public static void main(String[] args) {
		SpringApplication.run(LicApplication.class, args);
	}

}
