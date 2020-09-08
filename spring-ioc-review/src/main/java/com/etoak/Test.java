package com.etoak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.etoak.config.SpringConfig;
import com.etoak.controller.UserController;

public class Test {

	public static void main(String[] args) {
//		ApplicationContext ioc = new 
//				ClassPathXmlApplicationContext("spring.xml");
//		
//		UserController userController = ioc.getBean(UserController.class);
//		userController.addUser();
		
		ApplicationContext ioc = new 
			AnnotationConfigApplicationContext(SpringConfig.class);
		
		UserController userController = ioc.getBean(UserController.class);
		userController.addUser();
		
		
		
	}
}
