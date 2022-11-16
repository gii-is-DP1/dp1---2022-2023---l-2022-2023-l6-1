package org.springframework.samples.petclinic.card;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CardRepository extends CrudRepository<Card, Integer>{

	@Query("SELECT card FROM Card card WHERE card.id =:id")
	public Collection<Card> findById(@Param("id") int id);
	
}
