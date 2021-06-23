package com.administrador.demo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrador.demo.dao.UsuarioDAO;
import com.administrador.demo.model.Usuario;
import com.administrador.demo.servicioInterface.UsuarioInterface;
@Service
public class UsuarioSevicio implements UsuarioInterface {
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return (List<Usuario>)usuarioDAO.findAll();
	}

	@Override
	public Optional<Usuario> listarId(Long id) {
		// TODO Auto-generated method stub
		return usuarioDAO.findById(id);
	}
	@Override
	public Optional<Usuario> BuscarEmail(String email){
        return  usuarioDAO.BuscarEmail(email);

	}
	
	
	

	@Override
	public int save(Usuario u) {
		// TODO Auto-generated method stub
		int res=0;
		u.setFechaRegistro("20-06-21");
		u.setUltimoLogin("21-06-21");
		Usuario usu=usuarioDAO.save(u);
		if(!usu.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioDAO.deleteById(id);
	}
	

}
