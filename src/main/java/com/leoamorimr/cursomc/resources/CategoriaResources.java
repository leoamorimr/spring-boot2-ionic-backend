package com.leoamorimr.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import com.leoamorimr.cursomc.domain.Categoria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResources {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar() {

        Categoria categoria = new Categoria(1, "Informática");
        Categoria categoria2 = new Categoria(2, "Escritório");

        List<Categoria> listCategoria = new ArrayList<>();
        listCategoria.add(categoria);
        listCategoria.add(categoria2);

        return listCategoria;
    }

}
