package org.springframework.samples.petclinic.board;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

import org.springframework.samples.petclinic.card.Card;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "board")
public class Board extends BaseEntity{
//	
//	@Timespan
//	private Duration timer;
//	
//	@OneToMany
//	@Min(value = 4)
//	@Max(value = 4)
//	private List<Pile> pileBoard;
//	
//	@OneToOne
//	private PlayZone playZoneBoard;
//	
//	@OneToOne
//	private Deck deckBoard;
//	
//	@OneToOne
//	private Player playerBoard;
	

	
	String background;
	@Positive
	int width;
	@Positive
	int height;
	
	public Board() {
		this.background = "/resources/images/background.jpg";
		this.width = 960;
		this.height = 540;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "board", fetch = FetchType.EAGER)
	List<Card> cards;
	
}
