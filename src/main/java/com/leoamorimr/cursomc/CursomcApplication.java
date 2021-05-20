package com.leoamorimr.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.leoamorimr.cursomc.domain.Categoria;
import com.leoamorimr.cursomc.domain.Cidade;
import com.leoamorimr.cursomc.domain.Cliente;
import com.leoamorimr.cursomc.domain.Endereco;
import com.leoamorimr.cursomc.domain.Estado;
import com.leoamorimr.cursomc.domain.ItemPedido;
import com.leoamorimr.cursomc.domain.Pagamento;
import com.leoamorimr.cursomc.domain.PagamentoComBoleto;
import com.leoamorimr.cursomc.domain.PagamentoComCartao;
import com.leoamorimr.cursomc.domain.Pedido;
import com.leoamorimr.cursomc.domain.Produto;
import com.leoamorimr.cursomc.domain.enums.EstadoPagamento;
import com.leoamorimr.cursomc.domain.enums.TipoCliente;
import com.leoamorimr.cursomc.repository.CategoriaRepository;
import com.leoamorimr.cursomc.repository.CidadeRepository;
import com.leoamorimr.cursomc.repository.ClienteRepository;
import com.leoamorimr.cursomc.repository.EnderecoRepository;
import com.leoamorimr.cursomc.repository.EstadoRepository;
import com.leoamorimr.cursomc.repository.ItemPedidoRepository;
import com.leoamorimr.cursomc.repository.PagamentoRepository;
import com.leoamorimr.cursomc.repository.PedidoRepository;
import com.leoamorimr.cursomc.repository.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {



    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {

    }

}