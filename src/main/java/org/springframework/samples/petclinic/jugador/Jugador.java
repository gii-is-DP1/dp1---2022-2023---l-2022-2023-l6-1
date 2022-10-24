package org.springframework.samples.petclinic.jugador;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
	@NotEmpty
	String nombre;
	
	@Column(name = "apellidos")
	@NotEmpty
	String apellidos;
	
	@Column(name = "contraseña")
	@NotEmpty
	String contraseña;
	
	@Column(name = "correo")
	@javax.validation.constraints.Email(message = "El correo no es válido", regexp = ".*")
	@NotEmpty
	String correo;
	
	@Column(name = "listaAmigos")
	List<String> listaAmigos;

}
