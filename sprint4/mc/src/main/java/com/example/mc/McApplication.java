package com.example.mc;

import com.example.mc.services.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class McApplication {
	private static MessageService messageService;

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(McApplication.class, args);
		messageService = context.getBean("messageService", MessageService.class);
		String res = messageService.message();
		System.out.println(res);
	}

}
