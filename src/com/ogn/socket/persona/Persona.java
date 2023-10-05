package com.ogn.socket.persona;

import java.io.Serializable;

public class Persona implements Serializable{
	
	private String nombre;
	private String edad;
	private String email;
	
	
	public Persona() {
		super();
	
	}




	public Persona(String nombre, String edad, String email) {
		this.nombre = nombre;
		this.edad = edad;
		this.email = email;
	}




	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
	

}
