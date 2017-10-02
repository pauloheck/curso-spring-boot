package br.com.tt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlle {

	@GetMapping("/")
	String home() {
		return "index";
	}

	@GetMapping("/pagina-1")
	String page1() {
		return "pagina1";
	}

	@GetMapping("/pagina-2")
	String page2() {
		return "pagina2";
	}

	@GetMapping("/pagina-3")
	String page3() {
		return "pagina3";
	}
}
