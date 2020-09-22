package com.pruebas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebas.model.Person;

public interface IUserRepo extends JpaRepository<User, String>{

}
