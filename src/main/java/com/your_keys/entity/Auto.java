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
@Table(name="auto" , uniqueConstraints = {@UniqueConstraint(columnNames = {"matricula"})})
public class Auto  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private long id_auto;
	
	@Column(nullable = false,length = 8)
	private String matricula;
	
	@Column(nullable = false)
	private long id_modelo;
	
	@Column(nullable = false)
	private long id_categoria;
	
	@Column(nullable = false)
	private String color;
	
	@Column(nullable = false)
	private int capacidad;
	
	@Column(nullable = false)
	private Double potencia;
	
	@Column(nullable = false)
	private Double precio_diario;
	
	private String url_imagen;
	
	@Column(nullable = false)
	private long id_estado;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="id_auto")
	
	
	 
	
	public long getId_auto() {
		return id_auto;
	}
	public void setId_auto(long id_auto) {
		this.id_auto = id_auto;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public long getId_modelo() {
		return id_modelo;
	}
	public void setId_modelo(long id_modelo) {
		this.id_modelo = id_modelo;
	}
	public long getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public Double getPotencia() {
		return potencia;
	}
	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}
	public Double getPrecio_diario() {
		return precio_diario;
	}
	public void setPrecio_diario(Double precio_diario) {
		this.precio_diario = precio_diario;
	}
	public String getUrl_imagen() {
		return url_imagen;
	}
	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}
	public long getId_estado() {
		return id_estado;
	}
	public void setId_estado(long id_estado) {
		this.id_estado = id_estado;
	}
	
	
	
	
	

}
