package br.com.grandpet.domain.repository;

import java.util.List;

import br.com.grandpet.domain.model.Estado;

public interface EstadoRepository {

	List<Estado> listar();
    Estado buscar(Long id);
    Estado salvar(Estado estado);
    void remover(Estado estado);
}
