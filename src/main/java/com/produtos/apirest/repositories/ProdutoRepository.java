package com.produtos.apirest.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.produtos.apirest.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	/*@Query(value = "select p from Produto p where p.nome like ?1", nativeQuery = true)
	public Produto findByNome(String nome);*/

}
