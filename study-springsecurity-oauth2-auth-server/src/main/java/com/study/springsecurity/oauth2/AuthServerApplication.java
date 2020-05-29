package com.study.springsecurity.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * TODO 认证服务器启动类
 * 
 * @author fengb
 * @data 2020年5月29日
 *
 */
@SpringBootApplication
public class AuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServerApplication.class, args);
	}
}
