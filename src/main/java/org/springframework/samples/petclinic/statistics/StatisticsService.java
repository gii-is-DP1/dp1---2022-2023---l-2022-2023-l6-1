package org.springframework.samples.petclinic.statistics;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StatisticsService {

	
	private StatisticsRepository statisticsRepository;
	
	@Autowired
	public StatisticsService(StatisticsRepository statisticsRepository) {
		this.statisticsRepository = statisticsRepository;
	}
	
	@Transactional(readOnly = true)
	public Statistics findById(int id) throws DataAccessException{
		return statisticsRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Iterable<Statistics> findAll() throws DataAccessException{
		return statisticsRepository.findAll();
	}
	
}
