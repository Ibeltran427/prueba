package com.pruebas.services;

import java.util.List;

import com.pruebas.model.Person;

public interface IPersonServices {
	
	public List<Person>searchAllPeople();	
	public Person searchPersonById(String id);
	public void savePerson(Person person);
	public void deletePerson(String id);
}
