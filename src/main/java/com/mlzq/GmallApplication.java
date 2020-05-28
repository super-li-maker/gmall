package com.mlzq;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.mlzq.mapper")
public class GmallApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallApplication.class, args);
	}

}
