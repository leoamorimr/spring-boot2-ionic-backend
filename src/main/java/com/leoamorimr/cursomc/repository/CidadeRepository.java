package com.leoamorimr.cursomc.repository;

import com.leoamorimr.cursomc.domain.Cidade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
