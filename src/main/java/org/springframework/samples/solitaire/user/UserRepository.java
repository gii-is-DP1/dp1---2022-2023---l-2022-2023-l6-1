package org.springframework.samples.solitaire.user;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends  CrudRepository<User, String>{
	
}
