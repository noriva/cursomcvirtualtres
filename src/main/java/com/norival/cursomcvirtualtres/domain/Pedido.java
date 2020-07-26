package com.norival.cursomcvirtualtres.domain;

import java.io.Serializable;
import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.OneToOne;


@Entity
public class Pedido implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPedido ;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date instante ;
	
	//@OneToOne(cascade=CascadeType.ALL, mappedBy="pedido");
	private Pagamento pagamento ;

	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente ;
	
	
	@ManyToOne
	@JoinColumn(name="endereco_id")
	private Endereco endrecoEntrega ;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Integer idPedido, Date instante, Cliente cliente, Endereco endrecoEntrega) {
		super();
		this.idPedido = idPedido;
		this.instante = instante;
		//this.pagamento = pagamento;
		this.cliente = cliente;
		this.endrecoEntrega = endrecoEntrega;
	}

	public Integer getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}

	public Date getInstante() {
		return instante;
	}

	public void setInstante(Date instante) {
		this.instante = instante;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEndrecoEntrega() {
		return endrecoEntrega;
	}

	public void setEndrecoEntrega(Endereco endrecoEntrega) {
		this.endrecoEntrega = endrecoEntrega;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPedido == null) ? 0 : idPedido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (idPedido == null) {
			if (other.idPedido != null)
				return false;
		} else if (!idPedido.equals(other.idPedido))
			return false;
		return true;
	}
	
	
	
}
