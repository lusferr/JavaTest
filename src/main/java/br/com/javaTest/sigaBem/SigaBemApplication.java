package br.com.javaTest.sigaBem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SigaBemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigaBemApplication.class, args);
	}

}
