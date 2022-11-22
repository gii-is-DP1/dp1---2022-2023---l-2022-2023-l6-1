package org.springframework.samples.petclinic.SolicitudAmistad;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "SolicitudDeAmistad")
public class SolicitudAmistad extends BaseEntity {

    @Column(name = "nombreJugadorSolicita")
    private String nombreJugadorSolicita;

    @Column(name = "nombreJugadorSolicitado")
    private String nombreJugadorSolicitado;

}