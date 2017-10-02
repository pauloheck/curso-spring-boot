package br.com.tt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class AulaWeb02Application {

	public static void main(String[] args) {
		SpringApplication.run(AulaWeb02Application.class, args);
	}

	@GetMapping
	public String index() {
		return "index";
	}
}
