package org.springframework.samples.solitaire.statistics;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.samples.solitaire.user.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AchievementsStatisticsService {
	
	private AchievementsStatisticsRepository achievementsStatisticsRepository;
	
	@Autowired
	public AchievementsStatisticsService(AchievementsStatisticsRepository achievementsStatisticsRepository) {
		this.achievementsStatisticsRepository = achievementsStatisticsRepository;
	}
	
	@Transactional
	public void saveAchievementsStatistics(AchievementsStatistics achievementsStatistics) throws DataAccessException {
		achievementsStatisticsRepository.save(achievementsStatistics);	
	}	
	
	@Transactional(readOnly = true)
	public Collection<AchievementsStatistics> findById(int id) throws DataAccessException{
		return achievementsStatisticsRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Iterable<AchievementsStatistics> findAll() throws DataAccessException{
		return achievementsStatisticsRepository.findAll();
	}
	
	@Transactional
	public void deleteAchievementsStatistics(AchievementsStatistics achievementsStatistics) throws DataAccessException {
		//deleting achievementsStatistics
		
		achievementsStatisticsRepository.delete(achievementsStatistics);	
		
	}
	

}
