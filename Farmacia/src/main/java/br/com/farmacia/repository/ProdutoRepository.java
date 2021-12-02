package br.com.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.farmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
public List<Produto> findAllByNomeContainingIgnoreCase(String nome);

	}