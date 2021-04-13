package com.leoamorimr.cursomc.repository;

import com.leoamorimr.cursomc.domain.Estado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
