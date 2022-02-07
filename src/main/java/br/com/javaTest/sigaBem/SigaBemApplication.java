package br.com.javaTest.sigaBem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@EnableFeignClients
@SpringBootApplication
@RestController
@RequestMapping("/")
public class SigaBemApplication {
	
	@GetMapping
	public ModelAndView swaggerUi() {
		return new ModelAndView("redirect:/swagger-ui/");
	}

	public static void main(String[] args) {
		SpringApplication.run(SigaBemApplication.class, args);
	}

}
