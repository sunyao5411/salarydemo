package com.eastern.maintenance.salary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.ws.rs.ApplicationPath;

@SpringBootApplication
@ComponentScan(basePackages = "com.eastern.maintenance.salary")
@MapperScan(basePackages = "com.eastern.maintenance.salary.dao")
@ApplicationPath("/v1")
public class SalaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalaryApplication.class, args);
//		test();
	}

	public static void test() {
		System.out.println(1.0000 == 1);
	}
}
