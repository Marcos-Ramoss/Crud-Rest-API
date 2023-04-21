package com.innovatec.SmartSoluctions.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.innovatec.SmartSoluctions.funcionarios.Funcionarios;
import com.innovatec.SmartSoluctions.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionarios")
public class FuncionariosController {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@GetMapping
	public List<Funcionarios> Listar() {
		return funcionarioRepository.findAll();
	}

	@GetMapping("/funcionarios/{id}")
	public Optional<Funcionarios> ListId(@PathVariable(value = "id") Long id) {
		return funcionarioRepository.findById(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Funcionarios adicionar(@RequestBody Funcionarios funcionarios) {
		return funcionarioRepository.save(funcionarios);
	}

	@DeleteMapping
	public void DeleteFucionario(@RequestBody Funcionarios funcionarios) {
		funcionarioRepository.delete(funcionarios);
	}

	@PutMapping
	public void atualizar(@RequestBody Funcionarios funcionarios) {
		funcionarioRepository.delete(funcionarios);
	}

}
