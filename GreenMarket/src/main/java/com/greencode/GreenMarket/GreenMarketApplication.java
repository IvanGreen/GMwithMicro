package com.greencode.GreenMarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GreenMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenMarketApplication.class, args);
	}

}
