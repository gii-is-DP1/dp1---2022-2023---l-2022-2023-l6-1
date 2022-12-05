package org.springframework.samples.petclinic.friends;


import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.friendRequest.FriendRequest;
import org.springframework.samples.petclinic.player.Player;

public interface FriendsRepository extends CrudRepository<Friends,Integer> {

	@Query("SELECT friendRequest FROM FriendRequest friendRequest WHERE friendRequest.playerReceiver.id =:friend1_id and friendRequest.playerSender.id =:friend2_id")
    public Friends findByPlayerReceiverIdAndPlayerSenderId(@Param("friend1_id") Player friend1,@Param("friend2_id") Player friend2);
	
	@Query("SELECT friend FROM Friends friend WHERE friend.friend1 =:player or friend.friend2 =:player")
    public Collection<Friends> findByPlayerAllFriends(@Param("player") Player player);
	
	
	@Query("SELECT friend FROM Friends friend WHERE friend.id = :id")
	public Friends findById(@Param("id") int id);
	
}
