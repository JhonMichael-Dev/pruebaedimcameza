package com.jhondev.core.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Encabezado generated by hbm2java
 */
@Entity
@Table(name = "encabezado", schema = "public")
public class Encabezado implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idEncabezado;
	private Usuario usuarios;
	private Date fechaCreacion;
	private Set<Detalle> detalleses = new HashSet<Detalle>(0);

	public Encabezado() {
	}

	public Encabezado(int idEncabezado, Usuario usuarios, Date fechaCreacion) {
		this.idEncabezado = idEncabezado;
		this.usuarios = usuarios;
		this.fechaCreacion = fechaCreacion;
	}

	public Encabezado(int idEncabezado, Usuario usuarios, Date fechaCreacion, Set<Detalle> detalleses) {
		this.idEncabezado = idEncabezado;
		this.usuarios = usuarios;
		this.fechaCreacion = fechaCreacion;
		this.detalleses = detalleses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_encabezado", unique = true, nullable = false)
	public int getIdEncabezado() {
		return this.idEncabezado;
	}

	public void setIdEncabezado(int idEncabezado) {
		this.idEncabezado = idEncabezado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuario", nullable = false)
	public Usuario getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_creacion", nullable = false, length = 13)
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "encabezado")
	public Set<Detalle> getDetalleses() {
		return this.detalleses;
	}

	public void setDetalleses(Set<Detalle> detalleses) {
		this.detalleses = detalleses;
	}

}