package com.norival.cursomcvirtualtres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.norival.cursomcvirtualtres.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	//Operações de acesso a dados como busca , salvar , alterar , delatar
	
	
	
}
