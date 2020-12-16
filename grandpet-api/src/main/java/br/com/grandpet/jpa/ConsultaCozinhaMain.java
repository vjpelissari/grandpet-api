package br.com.grandpet.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import java.util.List;

import br.com.grandpet.GrandpetApiApplication;
import br.com.grandpet.domain.model.Cozinha;
import br.com.grandpet.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		
		// Inicia uma aplicacao nao web, diferente da classe GrandpetApiApplication, que espera requisicoes
		// Inicia nossa app springboot como nao sendo uma app web.
		// Lembrar de rodar como Run as -> Java Aplication
		ApplicationContext applicationContext = new SpringApplicationBuilder(GrandpetApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		// Com o trecho acima eh possivel pegar um Bean da minha aplicacao
		// Pegando um Bean do tipo CadastroCozinha
		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> cozinhas = cozinhaRepository.listar();
				
		for (Cozinha cozinha : cozinhas) {
			System.out.println(cozinha.getNome());
		}
	}
}