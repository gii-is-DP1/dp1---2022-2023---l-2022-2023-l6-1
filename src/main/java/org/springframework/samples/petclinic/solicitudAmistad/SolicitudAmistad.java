package org.springframework.samples.petclinic.solicitudAmistad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "SolicitudAmistad")
public class SolicitudAmistad extends BaseEntity {


	@Column(name = "nombreJugadorSolicita")
    private String nombreJugadorSolicita;

    @Column(name = "nombreJugadorSolicitado")
    private String nombreJugadorSolicitado;

    @NotEmpty
    @Column(name = "relaccionPedido")
    private Integer relaccionPedido;
	
    
}
