package com.leoamorimr.cursomc.service;

import java.util.List;
import java.util.Optional;

import com.leoamorimr.cursomc.domain.Categoria;
import com.leoamorimr.cursomc.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.leoamorimr.cursomc.domain.Categoria;
import com.leoamorimr.cursomc.dto.CategoriaDTO;
import com.leoamorimr.cursomc.repository.CategoriaRepository;
import com.leoamorimr.cursomc.service.exception.DataIntegrityException;
import com.leoamorimr.cursomc.service.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repo;

    public Categoria find(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }

    public Categoria insert(Categoria obj) {
        obj.setId(null);
        return repo.save(obj);
    }

    public Categoria update(Categoria obj) {
        Categoria newObj = find(obj.getId());
        updateData(newObj, obj);
        return repo.save(newObj);
    }

    public void delete(Integer id) {
        try {
            repo.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            // Tratando o erro de integridade de dados
            throw new DataIntegrityException("Não é possível excluir uma Categoria com Produtos");
        }
    }

    public List<Categoria> findAll() {
        List<Categoria> categorias = repo.findAll();
        return categorias;
    }

    /**
     * @param page
     * @param linesPerPage
     * @param orderBy
     * @param direction
     * @return
     */
    public Page<Categoria> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
        return repo.findAll(pageRequest);
    }

    public Categoria fromDTO(CategoriaDTO objDTO) {
        return new Categoria(objDTO.getId(), objDTO.getNome());
    }

    private void updateData(Categoria newObj, Categoria obj) {
        newObj.setNome(obj.getNome());
    }
}