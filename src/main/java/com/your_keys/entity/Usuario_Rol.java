package com.your_keys.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario_rol")
public class Usuario_Rol implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario_rol;
	
	@Column(nullable = false)
	private Long id_usaurio;
	
	@Column(nullable = false)
	private Long id_rol;

	public Long getId_usuario_rol() {
		return id_usuario_rol;
	}

	public void setId_usuario_rol(Long id_usuario_rol) {
		this.id_usuario_rol = id_usuario_rol;
	}

	public Long getId_usaurio() {
		return id_usaurio;
	}

	public void setId_usaurio(Long id_usaurio) {
		this.id_usaurio = id_usaurio;
	}

	public Long getId_rol() {
		return id_rol;
	}

	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}
}
