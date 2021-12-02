package br.com.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

	}