package com.jhondev.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhondev.core.model.Detalle;

@Repository
public interface DetallesRepositorio extends JpaRepository<Detalle, Integer> {

}
