package com.norival.cursomcvirtualtres.domain;

import javax.persistence.Entity;

import com.norival.cursomcvirtualtres.domain.enums.EstadoPagamento;


@Entity
public class PagamentoComCartao extends Pagamento {

	private static final long serialVersionUID = 1L;

	private Integer numeroParcelas;

	public PagamentoComCartao() {
		// TODO Auto-generated constructor stub
	}

	public PagamentoComCartao(Integer idPagamento, EstadoPagamento estado, Pedido pedido, Integer numeroParcelas) {
		super(idPagamento, estado, pedido);
		this.numeroParcelas = numeroParcelas;
	}

	public Integer getNumeroParcelas() {
		return numeroParcelas;
	}

	public void setNumeroParcelas(Integer numeroParcelas) {
		this.numeroParcelas = numeroParcelas;
	}

}
