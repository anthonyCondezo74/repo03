package com.mitocode.repo;

import org.springframework.stereotype.Repository;

import com.mitocode.model.Persona;

@Repository
public class PersonaRepoImpl  implements IPersonaRepo{

	@Override
	public void registrar(Persona per) {
		System.out.println("Se registro a  =" + per.getNombre());
		
	}

}
