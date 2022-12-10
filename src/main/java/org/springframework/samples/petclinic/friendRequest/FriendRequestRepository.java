package org.springframework.samples.petclinic.friendRequest;


import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.player.Player;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRequestRepository extends CrudRepository<FriendRequest,Integer> {

	
	@Query("SELECT friendRequest FROM FriendRequest friendRequest WHERE friendRequest.id =:id")
    public FriendRequest findById(@Param("id") int id);
	
	@Query("SELECT friendRequest FROM FriendRequest friendRequest WHERE friendRequest.playerSender.user.username =:playerSenderName")
    public Collection<FriendRequest> findByPlayerSenderName(@Param("playerSenderName") String playerSenderName);
	
	@Query("SELECT friendRequest FROM FriendRequest friendRequest WHERE friendRequest.playerReceiver.user.username =:playerReceiverName")
    public Collection<FriendRequest> findByPlayerReceiverName(@Param("playerReceiverName") String playerReceiverName);
	
	@Query("SELECT friendRequest.playerSender FROM FriendRequest friendRequest WHERE friendRequest.playerReceiver.user.username =:playerReceiverName")
    public Collection<Player> findPlayerSenderByPlayerReceiverName(@Param("playerReceiverName") String playerReceiverName);
	
	@Query("SELECT friendRequest FROM FriendRequest friendRequest WHERE friendRequest.playerReceiver.user.username =:playerReceiverName and friendRequest.playerSender.user.username =:playerSenderName")
    public FriendRequest findByPlayerReceiverNameAndPlayerSenderName(@Param("playerReceiverName") String playerReceiverName,@Param("playerSenderName") String playerSenderName);
	
	
	
	
	
}
