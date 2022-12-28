package org.springframework.samples.solitaire.statistics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface AchievementsRepository extends CrudRepository<Achievements, Integer>{
	
	@Query("SELECT achievements FROM AchievementsStatistics achievements WHERE achievements.statistics.player.id= :id")
	public AchievementsStatistics findById(@Param("id") int id);
	

}
