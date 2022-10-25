package com.example.bootcamp_2_lombok;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootcamp2LombokApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Bootcamp2LombokApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		System.out.println("Demo");
	}

}
