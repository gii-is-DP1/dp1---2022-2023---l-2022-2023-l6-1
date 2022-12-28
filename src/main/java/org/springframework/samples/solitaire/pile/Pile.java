package org.springframework.samples.solitaire.pile;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.samples.solitaire.card.Card;
import org.springframework.samples.solitaire.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "piles")
public class Pile extends BaseEntity{
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Card> pilePlay;
	
	@Min(value = 3)
	@Max(value = 6)
	@Column(name = "numeroColumna")
	private Integer numeroColumna;
	
	public Integer getPositionXInPixelsPile(Integer size) {
    	return (numeroColumna)*size;
    }
}
