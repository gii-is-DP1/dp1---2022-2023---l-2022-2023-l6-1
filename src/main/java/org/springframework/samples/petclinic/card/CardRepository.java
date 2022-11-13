package org.springframework.samples.petclinic.card;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface CardRepository extends Repository<Card, Integer>{

	@Query("SELECT card FROM Card card")
	List<Card> findcard() throws DataAccessException;
}
