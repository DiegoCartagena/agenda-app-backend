package com.example.SpringVue.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SpringVue.model.Contactos;

@Service
public interface ContactosService {

	public List<Contactos>getAll();
	public Contactos get(Long id);
	public Contactos post(Contactos contactos);
	public Contactos put(Contactos contactos, Long id);
	public void delete(Long id);

}
