package com.jhondev.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhondev.core.model.Detalle;
import com.jhondev.core.repository.DetallesRepositorio;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class DetallesController {

	@Autowired
	private DetallesRepositorio detalleRepositorio;
	
	@PostMapping("/detalles")
	public Detalle crearDetalle(@RequestBody Detalle detalle) {
		return detalleRepositorio.save(detalle);
	}
}
