package org.springframework.samples.solitaire.statistics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AchievementsService {
	
	private AchievementsRepository achievementsRepository;
	
	@Autowired
	public AchievementsService(AchievementsRepository achievementsRepository) {
		this.achievementsRepository = achievementsRepository;
	}
	
	@Transactional(readOnly = true)
	public AchievementsStatistics findById(int id) throws DataAccessException{
		return achievementsRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Iterable<Achievements> findAll() throws DataAccessException{
		return achievementsRepository.findAll();
	}

	@Transactional(readOnly = true)
	public Achievements save(Achievements achievements) throws DataAccessException{
		return achievementsRepository.save(achievements);
	}
}
