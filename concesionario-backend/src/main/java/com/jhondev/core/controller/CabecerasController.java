package com.jhondev.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhondev.core.model.Encabezado;
import com.jhondev.core.repository.CabecerasRepositorio;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class CabecerasController {

	@Autowired
	private CabecerasRepositorio cabeceraRepositorio;

	@PostMapping("/cabeceras")
	public Encabezado crearCabecera(@RequestBody Encabezado cabecera) {
		return cabeceraRepositorio.save(cabecera);
	}
}
