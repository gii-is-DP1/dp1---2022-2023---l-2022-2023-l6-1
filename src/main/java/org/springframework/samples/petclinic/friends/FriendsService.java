package org.springframework.samples.petclinic.friends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
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
    public Friends findByName(String name) throws DataAccessException{
        return friendsRepository.findByName(name);
    }

}
