package com.etoak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etoak.controller.UserController;
import com.etoak.service.UserService;

@Configuration // <beans>
public class SpringConfig {

	@Bean("userService") // <bean id="方法名">
	public UserService userService() {
		return new UserService();
	}

	@Bean
	public UserController userController() {
		return new UserController();
	}

}
