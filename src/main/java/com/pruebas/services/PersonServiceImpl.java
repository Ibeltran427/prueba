package com.pruebas.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebas.model.Person;
import com.pruebas.repo.IPersonRepo;

@Service
public class PersonServiceImpl implements IPersonServices{
	
	@Autowired
	private IPersonRepo iperson;
	
	@Override
	public List<Person> searchAllPeople() {
		return this.iperson.findAll();
	}

	@Override
	public Person searchPersonById(String id) {	
		Optional<Person> person = iperson.findById(id);
		if(person.isPresent())
			return person.get();
		else
			return null;
	}

	@Override
	public void savePerson(Person person) {
		this.iperson.save(person);		
	}

	@Override
	public void deletePerson(String id) {
		this.iperson.deleteById(id);
	}
	
	

}
