package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Persona;
import com.mitocode.repo.IPersonaRepo;
import com.mitocode.repo.PersonaRepoImpl;

@Service
public class IPersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public void registrar(Persona per) {
		//repo=new PersonaRepoImpl();
		repo.registrar(per);
	}

}
