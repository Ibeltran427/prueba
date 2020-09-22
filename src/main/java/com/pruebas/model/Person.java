package com.pruebas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Persona")
public class Person {
	
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "name", nullable=false,length = 30)
	private String name;
	@Column(name = "lastName", nullable=false,length = 30)
	private String lastName;
	@Column(name = "fechaNacimiento", nullable=false)
	private Date fechaNacimiento;	
	

}
