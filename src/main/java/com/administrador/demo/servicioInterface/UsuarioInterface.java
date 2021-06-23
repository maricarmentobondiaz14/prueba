package com.administrador.demo.servicioInterface;
import java.util.List;
import java.util.Optional;

import com.administrador.demo.model.Usuario;
public interface UsuarioInterface {
	public List<Usuario> listar();
	public Optional<Usuario> listarId(Long id);
	public int save(Usuario u);
	public void delete(Long id);
	Optional<Usuario> BuscarEmail(String email);




}
