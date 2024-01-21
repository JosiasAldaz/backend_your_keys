package com.your_keys.entity;

import java.io.Serializable;
import java.util.Date;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "devolucion")
public class Devolucion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_devolución;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column(nullable = false, unique = true)
	private Long id_alquiler;
	
	@PrePersist
	public void prePersist() {
		fecha = new Date();
	}

	public Long getId_devolución() {
		return id_devolución;
	}

	public void setId_devolución(Long id_devolución) {
		this.id_devolución = id_devolución;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getId_alquiler() {
		return id_alquiler;
	}

	public void setId_alquiler(Long id_alquiler) {
		this.id_alquiler = id_alquiler;
	}
	
	
	
}
