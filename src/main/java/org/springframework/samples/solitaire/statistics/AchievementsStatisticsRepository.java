package org.springframework.samples.solitaire.statistics;
import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface AchievementsStatisticsRepository extends CrudRepository<AchievementsStatistics, Integer>{
	
	@Query("SELECT achievements FROM AchievementsStatistics achievements WHERE achievements.statistics.player.id= :id")
	public Collection<AchievementsStatistics> findById(@Param("id") int id);
	
	
	
}