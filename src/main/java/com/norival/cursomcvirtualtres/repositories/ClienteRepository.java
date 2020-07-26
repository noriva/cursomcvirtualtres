package com.norival.cursomcvirtualtres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.norival.cursomcvirtualtres.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	// Operações de acesso a dados como busca , salvar , alterar , delatar

}
