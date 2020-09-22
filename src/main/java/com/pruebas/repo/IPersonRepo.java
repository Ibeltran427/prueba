package com.pruebas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.model.Person;

public interface IPersonRepo extends JpaRepository<Person, String>{

}
