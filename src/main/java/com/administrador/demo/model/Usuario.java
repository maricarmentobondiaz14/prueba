package com.administrador.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String password;
	private String email;
	private String fechaRegistro;
	private String ultimoLogin;
	public Usuario() {
		
	}
	public Usuario(int id,String nombre, String password,String email,String fechaRegistro, String ultimoLogin) {
		super();
		this.nombre=nombre;
		this.password=password;
		this.email=email;
		this.fechaRegistro=fechaRegistro;
		this.ultimoLogin=ultimoLogin;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getUltimoLogin() {
		return ultimoLogin;
	}
	public void setUltimoLogin(String ultimoLogin) {
		this.ultimoLogin = ultimoLogin;
	}
	
	

}
