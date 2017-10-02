package br.com.tt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class AulaWeb06Application {

	public static void main(String[] args) {
		SpringApplication.run(AulaWeb06Application.class, args);
	}

	@GetMapping("/")
	String home() {
		return "index";
	}
}
