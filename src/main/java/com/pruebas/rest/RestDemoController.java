package com.pruebas.rest;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Person;
import com.pruebas.services.IPersonServices;

@RestController
@RequestMapping("/people")
public class RestDemoController {
	
	@Autowired
	private IPersonServices iPersonServices;
	
	@GetMapping
	public List<Person>searchAllPeople(){		
		return this.iPersonServices.searchAllPeople();		
	}
	
	@RequestMapping(value = "{id}")
	public Person searchPersonById(@PathVariable("id") String id){
		return this.iPersonServices.searchPersonById(id);
	}
	
	@PostMapping
	public ResponseEntity<Person> createProduct(@RequestBody Person person){
		this.iPersonServices.savePerson(person);
		return ResponseEntity.ok(person);
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable("id") String id){		
		this.iPersonServices.deletePerson(id);
		return ResponseEntity.ok(null);
	}
	
	@PutMapping
	public ResponseEntity<Person> updateProduct(@RequestBody Person person){
		this.iPersonServices.savePerson(person);
		return ResponseEntity.ok(person);
	}
}
