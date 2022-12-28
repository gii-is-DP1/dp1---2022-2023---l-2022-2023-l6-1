package org.springframework.samples.solitaire.statistics;

import static org.assertj.core.api.Assertions.assertThat;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.solitaire.statistics.Achievements;
import org.springframework.samples.solitaire.statistics.AchievementsService;
import org.springframework.samples.solitaire.statistics.AchievementsStatistics;
import org.springframework.stereotype.Service;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class AchievementsServiceTests {
	@Autowired
	protected AchievementsService achievementsService;
	
	@Test
	@Transactional
	void shouldFindAchievements() {
		AchievementsStatistics achievements = this.achievementsService.findById(1);
		assertThat(achievements.getAchievement().getName());
	}
	
	@Test
	@Transactional
	void shouldFindAllStatistics() {
		Iterable<Achievements> achievements = this.achievementsService.findAll();
		assertThat(achievements.iterator());
	}

}
