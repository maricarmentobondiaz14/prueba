package com.administrador.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.administrador.demo.model.Usuario;
@Repository
public interface UsuarioDAO extends CrudRepository<Usuario,Long> {
	@Query("select u from Usuario u where u.email = ?1")
	Optional<Usuario> BuscarEmail(String email);

}
