package org.springframework.samples.solitaire.user;

import org.springframework.data.repository.CrudRepository;



public interface AuthoritiesRepository extends  CrudRepository<Authorities, String>{
	
}
