package com.backend.aula04;

import com.backend.aula04.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula04Application implements CommandLineRunner {

	@Autowired
	private PriceService priceService;

	public static void main(String[] args) {
		SpringApplication.run(Aula04Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("O preço final é: " + priceService.calculateFinalPrice(100, "SP"));
	}
}
