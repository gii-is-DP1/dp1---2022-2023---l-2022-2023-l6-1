package org.springframework.samples.petclinic.friendRequest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.player.Player;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "friendRequests")
public class FriendRequest extends BaseEntity {

	@ManyToOne
	@JoinColumn(name = "playerSender")
    private Player playerSender;
    
	@ManyToOne
    @JoinColumn(name = "playerReceiver")
    private Player playerReceiver;

    @Column(name="state")
    private Boolean state;
	
}
