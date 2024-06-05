package com.miage.distances_services;

import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DistancesServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(DistancesServicesApplication.class, args);
	}
}
