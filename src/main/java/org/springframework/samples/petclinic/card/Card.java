package org.springframework.samples.petclinic.card;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="cards")
public class Card extends BaseEntity{

	@NotEmpty
	@Column(name = "color")
	private String color;
	
	@NotEmpty
	@Column(name = "suit")
	private String suit;
	
	@Min(value = 1)
	@Max(value = 13)
	@Column(name = "number")
	private Integer number;
	
//	@NotEmpty
//	private Boolean estaDescubierta;
}
