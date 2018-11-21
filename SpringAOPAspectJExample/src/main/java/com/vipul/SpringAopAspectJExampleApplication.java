package com.vipul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringAopAspectJExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopAspectJExampleApplication.class, args);
	}
}
