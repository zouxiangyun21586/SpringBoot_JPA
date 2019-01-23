package com.yr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.yr")
@EnableAutoConfiguration //相当于在这里进行了配置文件初始化
public class JpaMain {
	public static void main(String[] args) {
		SpringApplication.run(JpaMain.class, args);
	}
}
