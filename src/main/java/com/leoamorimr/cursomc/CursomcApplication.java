package com.leoamorimr.cursomc;

import java.util.Arrays;

import com.leoamorimr.cursomc.domain.Categoria;
import com.leoamorimr.cursomc.domain.Cidade;
import com.leoamorimr.cursomc.domain.Cliente;
import com.leoamorimr.cursomc.domain.Endereco;
import com.leoamorimr.cursomc.domain.Estado;
import com.leoamorimr.cursomc.domain.Produto;
import com.leoamorimr.cursomc.domain.enums.TipoCliente;
import com.leoamorimr.cursomc.repository.CategoriaRepository;
import com.leoamorimr.cursomc.repository.CidadeRepository;
import com.leoamorimr.cursomc.repository.ClienteRepository;
import com.leoamorimr.cursomc.repository.EnderecoRepository;
import com.leoamorimr.cursomc.repository.EstadoRepository;
import com.leoamorimr.cursomc.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000D);
		Produto p2 = new Produto(null, "Impressora", 800D);
		Produto p3 = new Produto(null, "Mouse", 80D);

		// Asssossiação da Categoria com o Produto
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		// Associação do Produto com a Categoria
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);

		// Associação de Cidades com os Estados
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));

		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));

		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "12313123", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("3222-2222", "9 99999-99"));

		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 203", "Jardim", "32323232", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "sala 800", "Centro", "32323232", cli1, c2);

		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));

		// PERSISTENCIA DOS CLIENTE E ENDEREÇO
		clienteRepository.save(cli1);
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
	}

}
