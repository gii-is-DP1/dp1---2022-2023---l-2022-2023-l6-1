package org.springframework.samples.solitaire.statistics;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.samples.solitaire.configuration.SecurityConfiguration;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.samples.solitaire.player.PlayerService;
import org.springframework.samples.solitaire.statistics.Statistics;
import org.springframework.samples.solitaire.statistics.StatisticsController;
import org.springframework.samples.solitaire.statistics.StatisticsService;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = StatisticsController.class, excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WebSecurityConfigurer.class), excludeAutoConfiguration = SecurityConfiguration.class)
public class StatisticsControllerTests {
	private static final int TEST_STATISTIC_ID = 8;

	@Autowired
	private StatisticsController statisticsController;

	@MockBean
	private StatisticsService statisticsService;
	
	@MockBean
	private PlayerService playerService;
	
	@Autowired
	private MockMvc mockMvc;

	private Statistics statistics;
	
	private Player george;

	@BeforeEach
	void setup() {

		statistics = new Statistics();
		statistics.setId(TEST_STATISTIC_ID);
		statistics.setGames(0);
		statistics.setGamesLost(0);
		statistics.setGamesWon(0);
		statistics.setTotalScore(0);
		george = new Player();
		george.setId(8);
		george.setFirstName("George");
		george.setLastName("Franklin");
		george.setEmail("george@gmail.com");
		playerService.savePlayer(george);
		statistics.setPlayer(george);
		
		given(this.statisticsService.findById(TEST_STATISTIC_ID)).willReturn(statistics);

	}

	@WithMockUser(value = "spring")
	@Test
	void testInitCreationForm() throws Exception {
		mockMvc.perform(get("/statistics")).andExpect(status().isOk());
	}

	@WithMockUser(value = "spring")
	@Test
	void testInitStatsFormSuccess() throws Exception {
		mockMvc.perform(get("/statistics/{playerId}", 8)).andExpect(status().isOk())
		.andReturn();
	}

}
