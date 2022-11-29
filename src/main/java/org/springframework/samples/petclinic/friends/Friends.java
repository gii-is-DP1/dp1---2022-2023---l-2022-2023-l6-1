package org.springframework.samples.petclinic.friends;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.solicitudAmistad.SolicitudAmistad;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "friends")
public class Friends extends BaseEntity{

	@NotEmpty
	@Column(name = "name")
	private String name;


	@OneToMany(cascade = CascadeType.ALL)
	private List<SolicitudAmistad> FriendsList;

}

