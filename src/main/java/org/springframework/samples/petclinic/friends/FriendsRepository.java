package org.springframework.samples.petclinic.friends;


import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.friendRequest.FriendRequest;
import org.springframework.samples.petclinic.player.Player;

public interface FriendsRepository extends CrudRepository<Friends,Integer> {


	@Query("SELECT friends FROM FriendsRequest playerSender,playerReceiver WHERE friends.playerSender.id =:friend1 and friends.friend2.id =:friend2")
    public Friends findByPlayerReceiverNameAndPlayerSenderName(@Param("player1") Integer friend1,@Param("player2") Integer friend2);
	
	
	
	
	
}
