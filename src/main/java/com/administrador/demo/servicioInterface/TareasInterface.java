package com.administrador.demo.servicioInterface;

import java.util.List;
import java.util.Optional;

import com.administrador.demo.model.Tareas;

public interface TareasInterface {
	public List<Tareas> listar();
	public Optional<Tareas> listarId(int id);
	public int save(Tareas t);
	public void delete(int id);
}
