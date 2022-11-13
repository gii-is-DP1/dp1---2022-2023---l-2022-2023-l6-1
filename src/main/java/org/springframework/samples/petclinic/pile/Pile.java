package org.springframework.samples.petclinic.pile;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.samples.petclinic.card.Card;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "piles")
public class Pile extends BaseEntity{
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Card> pilePlay;
	
	@Min(value = 1)
	@Max(value = 7)
	@Column(name = "numeroColumna")
	private Integer numeroColumna;
	
}
