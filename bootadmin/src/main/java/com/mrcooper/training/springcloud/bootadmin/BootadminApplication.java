package com.mrcooper.training.springcloud.bootadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@EnableDiscoveryClient
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class BootadminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootadminApplication.class, args);
	}
}
