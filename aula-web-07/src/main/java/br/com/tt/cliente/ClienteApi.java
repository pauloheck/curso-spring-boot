package br.com.tt.cliente;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
public class ClienteApi {

	@Autowired
	private ClienteService service;

	@GetMapping
	public List<Cliente> clientes() {
		return service.findAll();
	}

	@GetMapping("{id}")
	public Cliente cliente(@PathVariable(name="id") Long id) {
		return service.findOne(id);
	}
	@DeleteMapping("{id}")
	public void deletar(@PathVariable(name="id") Long id) {
		 service.delete(id);
	}

	@PostMapping
	public Cliente salvar(@Valid @RequestBody Cliente cliente) {
		return service.save(cliente);
	}

}
