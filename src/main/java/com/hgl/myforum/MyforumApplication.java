package com.hgl.myforum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.hgl.myforum.mapper*"})
public class MyforumApplication {
	/*这个是启动类*/
	public static void main(String[] args) {
		SpringApplication.run(MyforumApplication.class, args);
	}

}
