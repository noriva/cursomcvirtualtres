package com.norival.cursomcvirtualtres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.norival.cursomcvirtualtres.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
	// Operações de acesso a dados como busca , salvar , alterar , delatar

}
