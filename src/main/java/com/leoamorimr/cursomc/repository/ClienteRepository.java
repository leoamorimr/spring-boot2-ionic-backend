package com.leoamorimr.cursomc.repository;

import com.leoamorimr.cursomc.domain.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
