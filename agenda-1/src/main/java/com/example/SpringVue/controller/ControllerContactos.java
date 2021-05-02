package com.example.SpringVue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringVue.model.Contactos;
import com.example.SpringVue.services.ContactosService;
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600)
@RestController
@RequestMapping(value="/api")
public class ControllerContactos {
	
	@Autowired
	 private ContactosService contactoservice;
	
	@GetMapping(value="/all")
	public List<Contactos> findAll(){
		return contactoservice.getAll();
	}
	
	@PutMapping(value="/update")
	public Contactos update(Contactos contactos, Long id) {
		return contactoservice.put(contactos, id);
	}
	
	@GetMapping(value="/get/{id}")
	public Contactos get(@PathVariable(value="id")Long id) {
		return contactoservice.get(id);
	}
	
	@PostMapping(value="/save")
	public Contactos post(@RequestBody Contactos contactos){
		return contactoservice.post(contactos);
	}
	@DeleteMapping(value="/delete/{id}")
	public void delete(@PathVariable(value="id")Long id) {
		contactoservice.delete(id);
		
	}
	
	

}