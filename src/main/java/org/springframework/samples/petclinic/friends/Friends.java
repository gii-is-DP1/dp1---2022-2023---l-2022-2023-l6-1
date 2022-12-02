package org.springframework.samples.petclinic.friends;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.player.Player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Friends extends BaseEntity{
	
	@ManyToOne
	@JoinColumn(name = "friend1_id")
	private Integer friend1;
	
	@ManyToOne
	@JoinColumn(name = "friend2_id")
	private Integer friend2;
	
}
