package com.example.SpringVue.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringVue.model.Contactos;
import com.example.SpringVue.repository.ContactosRepository;

@Service
public class ContactosServiceImpl implements ContactosService {

	@Autowired
	private ContactosRepository contactosRepository;

	@Override
	public List<Contactos> getAll() {
		
		return (List<Contactos>) contactosRepository.findAll();
	}

	@Override
	public Contactos get(Long id) {
		
		return contactosRepository.findById(id).get();
	}

	@Override
	public Contactos post(Contactos contactos) {
	
		return contactosRepository.save(contactos);
	}

	@Override
	public Contactos put(Contactos contactos, Long id) {
		
			if(contactosRepository.findById(id)!=null) {
				return contactosRepository.save(contactos);
			}else {
				return null;
			}
			
	}

	@Override
	public void delete(Long id) {
		contactosRepository.deleteById(id);
		
	}
	
	
}
