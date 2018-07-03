package com.in28minutes.springboot.basics.springbootinsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootInStepsApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =
				SpringApplication.run(SpringbootInStepsApplication.class, args);

		for (String name : context.getBeanDefinitionNames()){
			System.out.println(name);
		}

	}
}
