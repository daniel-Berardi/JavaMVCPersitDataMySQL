package com.tinder.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinder.entidades.User;
import com.tinder.repositorio.UserRepositorio;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepositorio userRepositorio;
	
	
	public void crearUser(String nombre,String apellido,String mail,String clave) {
		
		User user = new User();
		
		user.setNombre(nombre);
		user.setApellido(apellido);
		user.setEmail(mail);
		user.setClave(clave);
		
		
		userRepositorio.save(user);
		
		
		
		
	}

}
