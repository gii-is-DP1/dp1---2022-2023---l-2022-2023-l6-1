package org.springframework.samples.solitaire.friends;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FriendsService {

	
	private FriendsRepository friendsRepository;

    @Autowired
    public FriendsService(FriendsRepository friendsRepository) {
        this.friendsRepository = friendsRepository;
    }


    @Transactional(readOnly = true)
    public Friends RequestById(Player id1, Player id2) throws DataAccessException {
        return friendsRepository.findByPlayerReceiverIdAndPlayerSenderId(id1, id2);
    }
    
    @Transactional(readOnly = true)
    public Collection<Friends> RequestByPlayer(Player player) throws DataAccessException {
        return friendsRepository.findByPlayerAllFriends(player);
    }
    
    @Transactional(readOnly = true)
    public Friends findFriendById(int id) throws DataAccessException {
        return friendsRepository.findById(id);
    }
    
    
    @Transactional
	public void saveFriends(Friends friends) throws DataAccessException {
		//creating Friends
    	friendsRepository.save(friends);	
	}	
	
	@Transactional
	public void deleteFriends(Friends friends) throws DataAccessException {
		//deleting Friends
		friendsRepository.delete(friends);	
		
	}	
    

    
}
