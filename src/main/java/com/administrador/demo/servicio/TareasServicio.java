package com.administrador.demo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrador.demo.dao.TareasDAO;
import com.administrador.demo.model.Tareas;
import com.administrador.demo.model.Usuario;
import com.administrador.demo.servicioInterface.TareasInterface;
@Service
public class TareasServicio implements TareasInterface {
	@Autowired
	private TareasDAO tareaDAO;
	@Override
	public List<Tareas> listar() {
		// TODO Auto-generated method stub
		return (List<Tareas>)tareaDAO.findAll();
	}

	@Override
	public Optional<Tareas> listarId(int id) {
		// TODO Auto-generated method stub
		return tareaDAO.findById(id);
	}

	@Override
	public int save(Tareas t) {
		// TODO Auto-generated method stub
		int res=0;
		Tareas tar=tareaDAO.save(t);
		if(!tar.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		tareaDAO.deleteById(id);


	}

}
