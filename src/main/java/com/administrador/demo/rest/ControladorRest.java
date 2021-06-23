package com.administrador.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.administrador.demo.model.Usuario;
import com.administrador.demo.servicioInterface.UsuarioInterface;




@Controller
public class ControladorRest {
	@Autowired
	private UsuarioInterface servicio;
	@GetMapping("iniciar")
	public String inicio() {
		
		return "index";
	}
	@PostMapping("login")
	public String login(@RequestParam String email,@RequestParam String password){
		System.out.println(email);
		System.out.println(password);

		return "redirect:tablero";
	}
	@GetMapping("crearusuarios")
	public String crearusuarios(Model model) {
		model.addAttribute("usuario",new Usuario());
		return "crearCuenta";
	}
	@PostMapping("/save")
	public String save(Usuario u,Model model) {
		int id=servicio.save(u);
		if(id==0) {
			return "crearusuarios";
		}
		return "redirect:tablero";
	}
	
	@GetMapping("listadousuarios")
	public String listadoUsuarios(Model model){
		model.addAttribute("usuarios",servicio.listar());
		return "usuarios";
	}
	
		
	
	


}
