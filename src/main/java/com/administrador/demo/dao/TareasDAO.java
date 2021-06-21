package com.administrador.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.administrador.demo.model.Tareas;
@Repository
public interface TareasDAO extends CrudRepository<Tareas,Integer> {

}
