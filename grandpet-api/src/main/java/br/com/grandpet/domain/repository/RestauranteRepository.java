package br.com.grandpet.domain.repository;

import java.util.List;

import br.com.grandpet.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Long id);
	
}
