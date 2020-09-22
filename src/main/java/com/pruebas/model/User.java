package com.pruebas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "usuario")
public class User {
	
	@Id
	private String id;
	private String nombre;
	private String clave;

}
