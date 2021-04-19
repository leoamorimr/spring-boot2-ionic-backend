package com.leoamorimr.cursomc.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leoamorimr.cursomc.domain.Cliente;
import com.leoamorimr.cursomc.exception.ObjectNotFoundException;
import com.leoamorimr.cursomc.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
	private ClienteRepository repo;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

}
