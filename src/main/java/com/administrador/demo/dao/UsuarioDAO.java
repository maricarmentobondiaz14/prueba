package com.administrador.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.administrador.demo.model.Usuario;
@Repository
public interface UsuarioDAO extends CrudRepository<Usuario,Integer> {

}
