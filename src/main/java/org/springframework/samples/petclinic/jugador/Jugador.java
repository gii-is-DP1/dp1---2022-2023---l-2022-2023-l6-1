package org.springframework.samples.petclinic.jugador;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
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
	@NotEmpty(message = "Los apellidos no pueden estar vacío")
	String apellidos;
	
	@Column(name = "contraseña")
	//Habria que crear una clase de validez para la contraseña
	String contraseña;
	
	@Column(name = "correo")
	@javax.validation.constraints.Email(message = "El correo no es válido", regexp = ".*")
	@NotEmpty
	String correo;
	
	@Column(name = "listaAmigos")
	List<String> listaAmigos;

}
