package org.springframework.samples.solitaire.statistics;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.solitaire.model.BaseEntity;
import org.springframework.samples.solitaire.player.Player;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "statistics")
public class Statistics extends BaseEntity{
	
	@Min(value=0)
	@Column(name="games")
	private Integer games;
	
	@Min(value=0)
	@Column(name="games_won")
	private Integer gamesWon;
	
	@Min(value=0)
	@Column(name="games_lost")
	private Integer gamesLost ;
	
	@Min(value=0)
	@Column(name="total_score")
	private Integer totalScore;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_id", referencedColumnName = "id")
	private Player player;
	

}
