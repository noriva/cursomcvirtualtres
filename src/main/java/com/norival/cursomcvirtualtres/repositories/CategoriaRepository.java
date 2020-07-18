package com.norival.cursomcvirtualtres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.norival.cursomcvirtualtres.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	// Operações de acesso a dados como busca , salvar , alterar , delatar

}
