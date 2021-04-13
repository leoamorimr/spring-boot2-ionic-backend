package com.leoamorimr.cursomc.repository;

import com.leoamorimr.cursomc.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
