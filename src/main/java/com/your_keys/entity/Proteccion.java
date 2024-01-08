package com.your_keys.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name ="prteccion")
public class Proteccion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_proteccion;
	private Long id_alquiler;
	private Date fecha;
	
	
	public Long getId_proteccion() {
		return id_proteccion;
	}
	public void setId_proteccion(Long id_proteccion) {
		this.id_proteccion = id_proteccion;
	}
	public Long getId_alquiler() {
		return id_alquiler;
	}
	public void setId_alquiler(Long id_alquiler) {
		this.id_alquiler = id_alquiler;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
