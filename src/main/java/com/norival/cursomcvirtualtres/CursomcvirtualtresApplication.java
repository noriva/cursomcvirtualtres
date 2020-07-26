package com.norival.cursomcvirtualtres;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.norival.cursomcvirtualtres.domain.Categoria;
import com.norival.cursomcvirtualtres.domain.Cidade;
import com.norival.cursomcvirtualtres.domain.Cliente;
import com.norival.cursomcvirtualtres.domain.Endereco;
import com.norival.cursomcvirtualtres.domain.Estado;
import com.norival.cursomcvirtualtres.domain.Produto;
import com.norival.cursomcvirtualtres.domain.enums.TipoCliente;
import com.norival.cursomcvirtualtres.repositories.CategoriaRepository;
import com.norival.cursomcvirtualtres.repositories.CidadeRepository;
import com.norival.cursomcvirtualtres.repositories.ClienteRepository;
import com.norival.cursomcvirtualtres.repositories.EnderecoRepository;
import com.norival.cursomcvirtualtres.repositories.EstadoRepository;
import com.norival.cursomcvirtualtres.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcvirtualtresApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository ;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcvirtualtresApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Pulo");

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1 , est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "Maria da silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardins", "38220834",cli1, c1);
		Endereco e2 = new Endereco(null, "Av matos", "105", "Sala 800", "Centro", "38772012",cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1 , e2));

	}

}
