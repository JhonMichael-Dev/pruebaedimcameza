package com.jhondev.core.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jhondev.core.exception.ResourceNotFoundException;
import com.jhondev.core.model.Producto;
import com.jhondev.core.repository.ProductosRepositorio;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProductosController {

	@Autowired
	private ProductosRepositorio productosRepositorio;

	@GetMapping("/productos")
	public List<Producto> obtenerProductos() {
		return productosRepositorio.findAll();
	}

	@PostMapping("/productos")
	public Producto crearProducto(@RequestBody Producto producto) {
		return productosRepositorio.save(producto);
	}

	@GetMapping("/productos/{id}")
	public ResponseEntity<Producto> productoPorId(@PathVariable Integer id) {
		Producto producto = productosRepositorio.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("no existe la motocicleta con id: " + id));
		return ResponseEntity.ok(producto);
	}
	
	@PutMapping("/productos/{id}")
	public ResponseEntity<Producto> actualizarProducto(@PathVariable String id, @RequestBody Producto producto){
		Producto productoBusqueda = productosRepositorio.findById(Integer.parseInt(id))
				.orElseThrow(() -> new ResourceNotFoundException("no existe la motocicleta con id: " + id));
		productoBusqueda.setNombre(producto.getNombre());
		productoBusqueda.setDescripcion(producto.getDescripcion());
		productoBusqueda.setPrecio(producto.getPrecio());
		
		Producto productoActualizado = productosRepositorio.save(productoBusqueda);
		return ResponseEntity.ok(productoActualizado);
	}
	
	@DeleteMapping("productos/{id}")
	public ResponseEntity<Map<String,Boolean>> borrarProducto(@PathVariable String id){
		Producto productoBusqueda = productosRepositorio.findById(Integer.parseInt(id))
				.orElseThrow(() -> new ResourceNotFoundException("no existe la motocicleta con id: " + id));
		productosRepositorio.delete(productoBusqueda);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
	}
}
