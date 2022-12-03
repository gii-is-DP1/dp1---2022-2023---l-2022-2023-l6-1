package org.springframework.samples.petclinic.friends;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.player.Player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Friends extends BaseEntity{
	
	@JoinColumn(name = "friend1")
	private Integer friend1;
	
	@JoinColumn(name = "friend2")
	private Integer friend2;
	
}
