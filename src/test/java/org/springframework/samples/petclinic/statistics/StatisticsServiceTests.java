package org.springframework.samples.petclinic.statistics;

import static org.assertj.core.api.Assertions.assertThat;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class StatisticsServiceTests {
	@Autowired
	protected StatisticsService statisticsService;


	@Test
	@Transactional
	void shouldFindGamesWonStatistics() {
		Statistics statistics = this.statisticsService.findById(1);
		assertThat(statistics.getGamesWon());
	}
	@Test
	@Transactional
	void shouldFindAllStatistics() {
		Iterable<Statistics> statistics = this.statisticsService.findAll();
		assertThat(statistics.iterator());
	}

}
