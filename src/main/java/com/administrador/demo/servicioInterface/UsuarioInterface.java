package com.administrador.demo.servicioInterface;
import java.util.List;
import java.util.Optional;

import com.administrador.demo.model.Usuario;
public interface UsuarioInterface {
	public List<Usuario> listar();
	public Optional<Usuario> listarId(int id);
	public int save(Usuario u);
	public void delete(int id);

}
