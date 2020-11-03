package br.com.grandpet.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.grandpet.GrandpetApiApplication;
import br.com.grandpet.domain.model.Cozinha;

public class InclusaoCozinhaMain {

	// Inicia uma aplicacao nao web, diferente da classe GrandpetApiApplication, que espera requisicoes
	// Inicia nossa app springboot como nao sendo uma app web.
	// Lembrar de rodar como Run as -> Java Aplication
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(GrandpetApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);

		Cozinha cozinha1 = new Cozinha();
		cozinha1.setNome("Brasileira");

		Cozinha cozinha2 = new Cozinha();
		cozinha2.setNome("Japonesa");

		cozinha1 = cadastroCozinha.salvar(cozinha1);
		cozinha2 = cadastroCozinha.salvar(cozinha2);

		System.out.printf("%d - %s\n", cozinha1.getId(), cozinha1.getNome());
		System.out.printf("%d - %s\n", cozinha2.getId(), cozinha2.getNome());
	}
}