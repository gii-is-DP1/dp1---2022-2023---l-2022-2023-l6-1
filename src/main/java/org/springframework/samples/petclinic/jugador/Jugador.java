package org.springframework.samples.petclinic.jugador;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "jugadores")
public class Jugador{
	
	@Id
	@Column(name = "nombre")
	@NotEmpty(message = "El nombre no puede estar vacío")
	String nombre;
	
	@Column(name = "apellidos")
	@NotEmpty(message = "Los apellidos no pueden estar vacíos")
	String apellidos;
	
	@Column(name = "contraseña")
	//Habría que crear una clase de validez para la contraseña
	String contraseña;
	
	@Column(name = "correo")
	@Email(message = "El correo no es válido", regexp = ".*")
	@NotEmpty(message = "El correo no puede estar vacío")
	String correo;
	
	/**
	@Column(name="listaAmigos")
	**/
}
