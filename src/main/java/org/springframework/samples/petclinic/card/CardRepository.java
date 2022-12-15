package org.springframework.samples.petclinic.card;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CardRepository extends CrudRepository<Card, Integer>{

	@Query("SELECT card FROM Card card WHERE card.id =:id")
	public Collection<Card> findById(@Param("id") int id);
	
	@Query("SELECT card FROM Card card")
	public List<Card> findAll();
	
	@Query("SELECT card FROM Card card WHERE card.board.id =:boardId and card.isShowed = TRUE")
	public List<Card> findAllCardsBoardId(@Param("boardId") int boardId);
	
	@Query("SELECT card FROM Card card WHERE card.board.id =:boardId and card.isShowed = FALSE")
	public List<Card> findAllCardsBoardIdFalse(@Param("boardId") int boardId);
	
	@Query("SELECT card FROM Card card WHERE card.id =:id")
	public Card findCardById(@Param("id") int id);
}
