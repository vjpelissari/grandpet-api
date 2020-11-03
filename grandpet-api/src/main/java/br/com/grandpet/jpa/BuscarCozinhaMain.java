package br.com.grandpet.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.grandpet.GrandpetApiApplication;
import br.com.grandpet.domain.model.Cozinha;

public class BuscarCozinhaMain {

	public static void main(String[] args) {

		// Inicia uma aplicacao nao web, diferente da classe GrandpetApiApplication, que
		// espera requisicoes
		// Inicia nossa app springboot como nao sendo uma app web.
		// Lembrar de rodar como Run as -> Java Aplication
		ApplicationContext applicationContext = new SpringApplicationBuilder(GrandpetApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

		Cozinha cozinha = cadastroCozinha.buscar(1L);

		System.out.println(cozinha.getNome());
	}
}
