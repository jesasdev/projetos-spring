package com.jesaias.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jesaias.project.dominio.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	

}
