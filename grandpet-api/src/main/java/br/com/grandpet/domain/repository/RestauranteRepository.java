package br.com.grandpet.domain.repository;

import java.util.List;

import br.com.grandpet.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> todos();
	Restaurante porId(Long id);
	Restaurante adicionar(Restaurante restaurante);
	void remover(Restaurante restaurante);
	
}
