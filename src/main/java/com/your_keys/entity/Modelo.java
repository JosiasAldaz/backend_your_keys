package com.your_keys.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="modelo" , uniqueConstraints = {@UniqueConstraint(columnNames = {"nombre"})})
public class Modelo implements Serializable{
	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private long id_modelo;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private long id_marca;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_modelo")
	 private List<Auto> autos;
	
	public long getId_modelo() {
		return id_modelo;
	}
	public void setId_modelo(long id_modelo) {
		this.id_modelo = id_modelo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getId_marca() {
		return id_marca;
	}
	public void setId_marca(long id_marca) {
		this.id_marca = id_marca;
	}
	

}
