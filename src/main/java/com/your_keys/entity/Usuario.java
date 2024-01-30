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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id_usuario;
		
		@Column(nullable = false, unique = true)
		private Long id_persona;
		
		@Column(nullable = false, unique = true)
		private String username;
		
		@Column(nullable = false)
		private String password;
		
		@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinColumn(name = "id_usuario")
		private List<Usuario_Rol> usuarios_roles;

		public Long getId_usuario() {
			return id_usuario;
		}

		public void setId_usuario(Long id_usuario) {
			this.id_usuario = id_usuario;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<Usuario_Rol> getUsuarios_roles() {
			return usuarios_roles;
		}

		public void setUsuarios_roles(List<Usuario_Rol> usuarios_roles) {
			this.usuarios_roles = usuarios_roles;
		}

		public Long getId_persona() {
			return id_persona;
		}

		public void setId_persona(Long id_persona) {
			this.id_persona = id_persona;
		}
		
}
