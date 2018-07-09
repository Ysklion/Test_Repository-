package com.xqoa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author ysk
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("com.xqoa.dao")
public class XqoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(XqoaApplication.class, args);
	}
}
