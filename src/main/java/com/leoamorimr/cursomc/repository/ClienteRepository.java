package com.leoamorimr.cursomc.repository;

import com.leoamorimr.cursomc.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    //Faz busca por Email para garantir que não haja email repetido.
    //O readOnly garante que não haja lock na tabela enquanto estiver gerando a consulta.
    @Transactional(readOnly = true)
    Cliente findByEmail(String email);

}