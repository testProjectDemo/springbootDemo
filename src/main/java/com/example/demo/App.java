package com.example.demo;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	private static Logger log = Logger.getAnonymousLogger();
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		SpringApplication.run(App.class, args);
		log.info("系统启动成功  用时["+(System.currentTimeMillis()-startTime)+"]");
	}

}
