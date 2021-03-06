package br.com.grandpet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.grandpet.domain.model.Cozinha;
import br.com.grandpet.domain.repository.CozinhaRepository;

@RestController
@RequestMapping("/teste")
public class TesteController {

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	@GetMapping("/cozinhas/por-nome")
	public List<Cozinha> cozinhasPorNome(@RequestParam("nome") String nome) {
		return cozinhaRepository.consultarPorNome(nome);
	}
}