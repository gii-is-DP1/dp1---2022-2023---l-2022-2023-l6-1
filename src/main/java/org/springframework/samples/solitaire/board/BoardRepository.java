package org.springframework.samples.solitaire.board;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Spring Data JPA OwnerRepository interface
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */

public interface BoardRepository extends CrudRepository<Board, Integer> {

	@Query("SELECT board FROM Board board WHERE board.id =:id")
	public Board findById(@Param("id") int id);
}
