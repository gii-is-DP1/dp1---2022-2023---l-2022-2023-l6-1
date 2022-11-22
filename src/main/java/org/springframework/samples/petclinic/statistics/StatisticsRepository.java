package org.springframework.samples.petclinic.statistics;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StatisticsRepository extends CrudRepository<Statistics, Integer>{
	
	@Query("SELECT statistics FROM Statistics statistics WHERE statistics.player.id= :id")
	public Statistics findById(@Param("id") int id);
	
	@Query("SELECT statistics FROM Statistics statistics WHERE statistics.player.id= :id")
	public Statistics findByPlayer(@Param("id") int id);
	
	
}
