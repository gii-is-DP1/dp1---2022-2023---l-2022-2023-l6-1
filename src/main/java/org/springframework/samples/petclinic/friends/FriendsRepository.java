package org.springframework.samples.petclinic.friends;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface FriendsRepository extends CrudRepository<Friends, Integer>{

	
	
	@Query("SELECT DISTINCT Friends FROM Friends Friends WHERE Friends.name LIKE :name%")
    public Friends findByName(@Param("name") String name);
}
