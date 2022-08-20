package funs.puppys.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan({"funs.puppys.web.mapper"})  
public class PuppysApplication {

	public static void main(String[] args) {
		SpringApplication.run(PuppysApplication.class, args);
	}

}
