package com.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.main.mapper")
public class SpringBootProgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProgresqlApplication.class, args);
	}
}
