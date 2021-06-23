package com.administrador.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Tareas {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long id_usuario;
	private int estado;
	private String descripcion;
	
	public Tareas() {
		
	}
	public Tareas(int id,long id_usuario, int estado ,String descripcion) {
		super();
		this.id=id;
		this.id_usuario=id_usuario;
		this.estado=estado;
		this.descripcion=descripcion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}