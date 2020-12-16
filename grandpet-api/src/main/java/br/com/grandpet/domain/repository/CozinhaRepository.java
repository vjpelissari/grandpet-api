package br.com.grandpet.domain.repository;

import java.util.List;
import br.com.grandpet.domain.model.Cozinha;

public interface CozinhaRepository {
	
	List<Cozinha> listar();

	Cozinha porId(Long id);

	Cozinha adicionar(Cozinha cozinha);

	void remover(Cozinha cozinha);
}
