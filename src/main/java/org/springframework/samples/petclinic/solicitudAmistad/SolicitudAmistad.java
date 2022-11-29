package org.springframework.samples.petclinic.solicitudAmistad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.player.Player;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "SolicitudAmistad")
public class SolicitudAmistad extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "JugadorSolicita")
    private Player JugadorSolicita;
    
	@ManyToOne
    @JoinColumn(name = "JugadorSolicitado")
    private Player JugadorSolicitado;

    
	
    
}
