package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
	@Bean
	@Conditional(PropertyCondition.class)
	public MyBean myBean() {
		return new MyBean();
	}
}