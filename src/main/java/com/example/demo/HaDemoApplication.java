package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaDemoApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello() throws UnknownHostException {
		InetAddress IP = InetAddress.getLocalHost();
		return "Server IP Address is - " + IP ;
	}
	
	@RequestMapping("/kill")
	public String kill() {
		System.exit(-1);
		return "";
	}
}
