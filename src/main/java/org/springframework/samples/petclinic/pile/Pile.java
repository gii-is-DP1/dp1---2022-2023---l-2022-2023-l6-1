package org.springframework.samples.petclinic.pile;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.card.Card;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Pile extends Card{
	
	@ManyToMany
	private List<Card> pile;
	
	@Min(value = 1)
	@Max(value = 7)
	@Column(name = "numColumna")
	private Integer numColumna;
	
}
