package com.tcs.crs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan({"com.tcs.*"})
@EnableAutoConfiguration
@EnableWebMvc // For the REST implementation we need to do the this annotation enable
public class DemoCollegeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCollegeProjectApplication.class, args);
	}

}
