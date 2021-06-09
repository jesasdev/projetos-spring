package com.jesaias.project.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesaias.project.dominio.Categoria;
import com.jesaias.project.repositories.CategoriaRepository;


@Service
public class CategoriaService {
    
	//Acessando o repository
	@Autowired
	  private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria>obj = repo.findById(id);
		return obj.orElse(null);
	}
	  
}
