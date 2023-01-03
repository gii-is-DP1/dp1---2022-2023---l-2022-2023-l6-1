package org.springframework.samples.solitaire.friendRequest;


import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.solitaire.friends.Friends;
import org.springframework.samples.solitaire.player.Player;
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
	
	@Query("SELECT friendRequest FROM FriendRequest friendRequest WHERE friendRequest.playerReceiver =:player or friendRequest.playerSender =:player")
    public Collection<FriendRequest> findByPlayerAllFriendRequest(@Param("player") Player player);
	
	@Query("SELECT friendRequest FROM FriendRequest friendRequest WHERE friendRequest.playerReceiver.user.username =:playerReceiverName and friendRequest.playerSender.user.username =:playerSenderName")
    public FriendRequest findByPlayerReceiverNameAndPlayerSenderName(@Param("playerReceiverName") String playerReceiverName,@Param("playerSenderName") String playerSenderName);
	
	@Query("SELECT friendRequest FROM FriendRequest friendRequest")
	public List<FriendRequest> findAll();
	
	
	
}
