package com.mitocode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;
import com.mitocode.service.IPersonaServiceImpl;

@RestController
public class PersonaController {
	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public void registrar() {
		Persona per = new Persona();
		per.setId(1);
		per.setNombre("MitoCode");
		
		//service= new IPersonaServiceImpl();
		service.registrar(per);
	}
	
}
