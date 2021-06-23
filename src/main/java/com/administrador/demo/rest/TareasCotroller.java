package com.administrador.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.administrador.demo.servicioInterface.TareasInterface;

@Controller
public class TareasCotroller {
	@Autowired
	private TareasInterface servicio;
	@GetMapping("tablero")
	public String creartablero(Model model) {
		model.addAttribute("tareas",servicio.listar());
		return "dashboard";
		
	}

}
