package org.springframework.samples.solitaire.playZone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
@Table(name = "playzone")
public class PlayZone extends BaseEntity{
	
	@Min(value = 1)
	@Max(value = 20)
	@Column(name = "numFile")
	private Integer numFile;
	
	@Min(value = 1)
	@Max(value = 7)
	@Column(name = "numColumn")
	private Integer numColumn;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@Min(value=7)
	@Max(value=7)
	private List<Card> playZoneCard;
	
	
}
