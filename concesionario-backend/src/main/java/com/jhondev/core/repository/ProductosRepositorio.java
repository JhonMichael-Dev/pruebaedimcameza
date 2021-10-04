package com.jhondev.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jhondev.core.model.Producto;

@Repository
public interface ProductosRepositorio extends JpaRepository<Producto, Integer> {

}
