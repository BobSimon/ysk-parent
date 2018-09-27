package com.ysk.admin;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath:config/spring-dubbo.xml" })

/**
 * @author Bob Simon
 */
public class App implements CommandLineRunner{

	private static Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		logger.info("启动消费者：SpringBoot Start Success");
	}

	@Override
	public void run(String... strings) throws Exception {
		System.err.println("启动消费者：SpringBoot Start Success");
	}

}
