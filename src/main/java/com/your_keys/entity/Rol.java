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

@Entity
@Table(name="rol")
public class Rol implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id_rol;
	
	@Column(nullable = false, unique = true)
	private String nombre;
	
	@OneToMany(fetch =FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name="id_rol")
    private List<Usuario_Rol> usuarios_roles;

	public Long getId_rol() {
		return id_rol;
	}

	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Usuario_Rol> getUsuarios_roles() {
		return usuarios_roles;
	}

	public void setUsuarios_roles(List<Usuario_Rol> usuarios_roles) {
		this.usuarios_roles = usuarios_roles;
	}
}
