package com.security.mybatiass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.security.mybatiass.mapper")
public class MybatiassApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatiassApplication.class, args);
	}
}
