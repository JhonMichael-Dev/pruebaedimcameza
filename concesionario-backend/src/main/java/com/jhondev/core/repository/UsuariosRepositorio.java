package com.jhondev.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jhondev.core.model.Usuario;

@Repository
public interface UsuariosRepositorio extends JpaRepository<Usuario, Integer> {

	@Query(value = "SELECT u from Usuarios u WHERE u.correo = :correo")
	public Usuario usuarioPorCorreo(@Param("correo") String correo);
}
