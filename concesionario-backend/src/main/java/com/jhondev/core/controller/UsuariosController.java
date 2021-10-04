package com.jhondev.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhondev.core.model.Usuario;
import com.jhondev.core.repository.UsuariosRepositorio;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UsuariosController {

	@Autowired
	private UsuariosRepositorio usuariosRepositorio;

	@GetMapping("/usuarios")
	public List<Usuario> obtenerUsuarios() {
		return usuariosRepositorio.findAll();
	}

	@PostMapping("/usuarios")
	public Usuario crearUsuario(@RequestBody Usuario usuario) {
		return usuariosRepositorio.save(usuario);
	}

	@GetMapping("/usuarios/{correo}")
	public ResponseEntity<Usuario> usuariosPorCorreo(@PathVariable String correo) {
		Usuario usuarioBusqueda = usuariosRepositorio.usuarioPorCorreo(correo);
		return ResponseEntity.ok(usuarioBusqueda);
	}

}
