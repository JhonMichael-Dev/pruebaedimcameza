package com.jhondev.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhondev.core.model.Encabezado;

@Repository
public interface CabecerasRepositorio extends JpaRepository<Encabezado, Integer> {

}
