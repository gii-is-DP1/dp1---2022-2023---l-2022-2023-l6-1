package org.springframework.samples.petclinic.board;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.samples.petclinic.deck.Deck;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pile.Pile;
import org.springframework.samples.petclinic.playZone.PlayZone;
import org.springframework.samples.petclinic.player.Player;

import jdk.jfr.Timespan;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "board")
public class Board extends BaseEntity{
	
	@Timespan
	private LocalTime timer;
	
	@OneToMany
	@Min(value = 4)
	@Max(value = 4)
	private List<Pile> pileBoard;
	
	@OneToOne
	private PlayZone playZoneBoard;
	
	@OneToOne
	private Deck deckBoard;
	
	@OneToOne
	private Player playerBoard;
}
