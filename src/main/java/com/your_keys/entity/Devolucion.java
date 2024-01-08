package com.your_keys.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "devolucion")
public class Devolucion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_devolución;
	private Long id_alquiler;
	private Date fecha;
	
	
	public Long getId_devolución() {
		return id_devolución;
	}
	public void setId_devolución(Long id_devolución) {
		this.id_devolución = id_devolución;
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
