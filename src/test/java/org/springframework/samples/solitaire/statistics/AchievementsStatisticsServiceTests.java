package org.springframework.samples.solitaire.statistics;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.samples.solitaire.player.PlayerService;
import org.springframework.samples.solitaire.statistics.Achievements;
import org.springframework.samples.solitaire.statistics.AchievementsStatistics;
import org.springframework.samples.solitaire.statistics.AchievementsStatisticsService;
import org.springframework.samples.solitaire.statistics.Statistics;
import org.springframework.stereotype.Service;



@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class AchievementsStatisticsServiceTests {
	@Autowired
	protected AchievementsStatisticsService achievementsStatisticsService;
	
	@Autowired
	protected PlayerService playerService;
	
	@Autowired
	protected StatisticsService statisticsService;
	
	@Autowired
	protected AchievementsService achievementsService;


	@Test
	@Transactional
	void shouldFindAchievementsStatistics() {
		Collection<AchievementsStatistics> achievementsStatistics = 
				this.achievementsStatisticsService.findById(1);
		assertThat(achievementsStatistics);
	}
	
	@Test
	@Transactional
	void shouldFindAllAchievementsStatistics() {
		Iterable<AchievementsStatistics> achievementsStatistics = this.achievementsStatisticsService.findAll();
		assertThat(achievementsStatistics.iterator());
	}
	
	@Test
	@Transactional
	public void shouldInsertAchievementsStastistics() {
		Player player = this.playerService.findPlayerById(1);
		AchievementsStatistics achievementsStastistics = new AchievementsStatistics();
		Statistics stats = new Statistics();
		stats.setGames(400);
		stats.setGamesLost(300);
		stats.setGamesWon(100);
		stats.setTotalScore(12000);
		stats.setPlayer(player);
		Achievements ach = new Achievements();
		ach.setCondition_unlocked("games>=150");
		ach.setDescription("Descripcion");
		ach.setImage("image");
		ach.setName("Nombre");
		
		achievementsStastistics.setStatistics(stats); 
		achievementsStastistics.setAchievement(ach);
		             
        this.statisticsService.saveStatistics(stats);
        this.achievementsService.saveAchievements(ach);
		this.achievementsStatisticsService.saveAchievementsStatistics(achievementsStastistics);
		assertThat(achievementsStastistics.getAchievement().getDescription());
	}


}
