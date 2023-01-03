package org.springframework.samples.solitaire.friends;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.samples.solitaire.model.BaseEntity;
import org.springframework.samples.solitaire.player.Player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Friends extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "friend1")
	private Player friend1;
	
	@ManyToOne
	@JoinColumn(name = "friend2")
	private Player friend2;
	
}
