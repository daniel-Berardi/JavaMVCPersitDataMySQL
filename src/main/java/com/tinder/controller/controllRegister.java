package com.tinder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tinder.servicios.UserService;

@Controller
@RequestMapping
public class controllRegister {
	
	@Autowired
	private UserService userService;
	
	
	
	
	
	@GetMapping("/registro")
	public String registro() {
		
		return "registro";
		
		
	}
	
	@PostMapping("/registrar")
	public String registrar(@RequestParam String nombre,@RequestParam String apellido,@RequestParam String email,@RequestParam String clave) {
		
		userService.crearUser(nombre, apellido, email, clave);
		
		
		
		return "index";
		
		
	}

}
