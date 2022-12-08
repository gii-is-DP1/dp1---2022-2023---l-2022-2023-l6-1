package org.springframework.samples.petclinic.statistics;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.player.Player;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "statistics")
public class Statistics extends BaseEntity{
	
	@NotEmpty
	@Min(value=0)
	@Column(name="games")
	private Integer games;
	
	@NotEmpty
	@Min(value=0)
	@Column(name="games_won")
	private Integer gamesWon;
	
	@NotEmpty
	@Min(value=0)
	@Column(name="games_lost")
	private Integer gamesLost ;
	
	@NotEmpty
	@Min(value=0)
	@Column(name="total_score")
	private Integer totalScore;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_id", referencedColumnName = "id")
	private Player player;
	

}
