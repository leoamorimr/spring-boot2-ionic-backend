package com.leoamorimr.cursomc.service;

import java.util.Optional;

import com.leoamorimr.cursomc.domain.Categoria;
import com.leoamorimr.cursomc.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }

}