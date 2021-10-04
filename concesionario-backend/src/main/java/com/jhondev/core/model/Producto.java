package com.jhondev.core.model;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Productos generated by hbm2java
 */
@Entity
@Table(name = "productos", schema = "public")
public class Producto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idProducto;
	private String nombre;
	private String descripcion;
	private BigDecimal precio;

	public Producto() {
	}

	public Producto(int idProducto, String nombre, BigDecimal precio) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(int idProducto, String nombre, String descripcion, BigDecimal precio) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto", unique = true, nullable = false)
	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion")
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "precio", nullable = false, precision = 0, scale = 0)
	public BigDecimal getPrecio() {
		return this.precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productos")
//	public Set<Detalle> getDetalleses() {
//		return this.detalleses;
//	}
//
//	public void setDetalleses(Set<Detalle> detalleses) {
//		this.detalleses = detalleses;
//	}

}

