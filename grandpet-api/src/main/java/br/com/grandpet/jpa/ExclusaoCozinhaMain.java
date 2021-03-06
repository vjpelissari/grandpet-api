package br.com.grandpet.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.grandpet.GrandpetApiApplication;
import br.com.grandpet.domain.model.Cozinha;
import br.com.grandpet.domain.repository.CozinhaRepository;

public class ExclusaoCozinhaMain {

	// Inicia uma aplicacao nao web, diferente da classe GrandpetApiApplication, que espera requisicoes
	// Inicia nossa app springboot como nao sendo uma app web.
	// Lembrar de rodar como Run as -> Java Aplication
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(GrandpetApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CozinhaRepository cozinhaRepository = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1L);
		
		cozinhaRepository.remover(cozinha.getId());
	}
}