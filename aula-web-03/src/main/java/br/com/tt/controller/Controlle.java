package br.com.tt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlle {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/teste")
	public String teste() {
		return "teste";
	}

}
