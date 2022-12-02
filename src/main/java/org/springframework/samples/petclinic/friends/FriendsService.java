package org.springframework.samples.petclinic.friends;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.player.Player;
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
    public Friends RequestById(int id1, int id2) throws DataAccessException {
        return friendsRepository.findByPlayerReceiverNameAndPlayerSenderName(id1, id2);
    }
    
    @Transactional(readOnly = true)
    public Collection<Friends> RequestByPlayerReceiverName(String username) throws DataAccessException {
        return friendsRepository.findByPlayerReceiverName(username);
    }
    
    @Transactional(readOnly = true)
    public Collection<Player> RequestPlayerSenderByPlayerReceiverName(String username) throws DataAccessException {
        return friendsRepository.findPlayerSenderByPlayerReceiverName(username);
    }
    
    @Transactional(readOnly = true)
    public Friends RequestByPlayerReceiverNameAndPlayerSenderName(String usernameR,String usernameS) throws DataAccessException {
        return friendsRepository.findByPlayerReceiverNameAndPlayerSenderName(usernameR, usernameS);
    }
    
    @Transactional(readOnly = true)
    public Collection<Friends> RequestByPlayerSenderName(String username) throws DataAccessException {
        return friendsRepository.findByPlayerSenderName(username);
    }
    
    
    @Transactional
	public void saveFriends(Friends Friends) throws DataAccessException {
		//creating Friends
    	friendsRepository.save(Friends);	
	}	
	
	@Transactional
	public void deleteFriends(Friends Friends) throws DataAccessException {
		//deleting Friends
		friendsRepository.delete(Friends);	
		
	}	
    

    
}
