package org.springframework.samples.petclinic.friendRequest;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.player.Player;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FriendRequestService {

	
	private FriendRequestRepository friendRequestRepository;

    @Autowired
    public FriendRequestService(FriendRequestRepository friendRequestRepository) {
        this.friendRequestRepository = friendRequestRepository;
    }


    @Transactional(readOnly = true)
    public FriendRequest RequestById(int id) throws DataAccessException {
        return friendRequestRepository.findById(id);
    }
    
    @Transactional(readOnly = true)
    public Collection<FriendRequest> RequestByPlayerReceiverName(String username) throws DataAccessException {
        return friendRequestRepository.findByPlayerReceiverName(username);
    }
    
    @Transactional(readOnly = true)
    public Collection<Player> RequestPlayerSenderByPlayerReceiverName(String username) throws DataAccessException {
        return friendRequestRepository.findPlayerSenderByPlayerReceiverName(username);
    }
    
    @Transactional(readOnly = true)
    public FriendRequest RequestByPlayerReceiverNameAndPlayerSenderName(String usernameR,String usernameS) throws DataAccessException {
        return friendRequestRepository.findByPlayerReceiverNameAndPlayerSenderName(usernameR, usernameS);
    }
    
    @Transactional(readOnly = true)
    public Collection<FriendRequest> RequestByPlayerSenderName(String username) throws DataAccessException {
        return friendRequestRepository.findByPlayerSenderName(username);
    }
    
    
    @Transactional
	public void saveFriendRequest(FriendRequest friendRequest) throws DataAccessException {
		//creating friendRequest
    	friendRequestRepository.save(friendRequest);	
	}	
	
	@Transactional
	public void deleteFriendRequest(FriendRequest friendRequest) throws DataAccessException {
		//deleting friendRequest
		friendRequestRepository.delete(friendRequest);	
		
	}	
    

    
}
