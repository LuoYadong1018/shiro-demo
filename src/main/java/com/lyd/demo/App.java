package com.lyd.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"com.lyd.demo.mapper"}) //扫描DAO
public class App {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(App.class, args);
	}

}
