package com.departament.userdepto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departament.userdepto.entities.user;
import com.departament.userdepto.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired //Injeção de independencia pra não estar a instanciar sempre
	private UserRepository repository; //Garante o acesso ao UserRepository
	
	@GetMapping
	public List<user> findAll(){ //No método repository já tem várias funções
		List<user> result = repository.findAll(); //FindAll é um método dentro do repository
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public user findById(@PathVariable Long id) { //O pathValue é uma notation que trata tipos de dados
		user result = repository.findById(id).get(); //O findById é um metodo dentro do repository
		return result;
	}
	
	@PostMapping
	public user insert(@RequestBody user usuario) {
		user result = repository.save(usuario);
		return result;
		
	}

}
