package org.springframework.samples.petclinic.statistics;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.NamedEntity;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "achievements")
public class Achievements extends NamedEntity{
	
	@NotEmpty
	@Column(name="description")
	private String description;
	
	
}
