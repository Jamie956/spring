package com.example.v3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/example/v3/beans.xml");
		User user = (User) context.getBean("userBean");
		String name = user.getName();
		System.out.println(name);
	}
}