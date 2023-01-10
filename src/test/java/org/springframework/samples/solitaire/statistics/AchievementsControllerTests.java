package org.springframework.samples.solitaire.statistics;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.samples.solitaire.configuration.SecurityConfiguration;
import org.springframework.samples.solitaire.friendRequest.FriendRequestService;
import org.springframework.samples.solitaire.friends.FriendsService;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.samples.solitaire.player.PlayerController;
import org.springframework.samples.solitaire.player.PlayerService;
import org.springframework.samples.solitaire.statistics.AchievementsController;
import org.springframework.samples.solitaire.user.AuthoritiesService;
import org.springframework.samples.solitaire.user.UserService;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = AchievementsController.class, excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WebSecurityConfigurer.class), excludeAutoConfiguration = SecurityConfiguration.class)
public class AchievementsControllerTests {
	

	
	@MockBean
	@Autowired
	private StatisticsService statisticsService;
	
	@MockBean
	@Autowired
	private AchievementsController achievementsController;

	@MockBean
	private AchievementsService achievementsService;
	
	@MockBean
	private PlayerService playerService;
	
	@MockBean
	private FriendRequestService friendRequestService;
	
	@MockBean
	private FriendsService friendsService;

	@MockBean
	private UserService userService;

	@MockBean
	private AuthoritiesService authoritiesService;

	@Autowired
	private MockMvc mockMvc;

	private Statistics statistics;
	
	private Achievements achievements;
	
	private Player george;
	
	@BeforeEach
	void setup() {

		statistics = new Statistics();
		statistics.setId(8);
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
		achievements = new Achievements();
		achievements.setId(2);
		achievements.setName("Sisi");
		achievements.setCondition_unlocked("gamesWon>200");
		achievements.setDescription("toma");
		achievementsService.save(achievements);
		
		given(this.statisticsService.findById(8)).willReturn(statistics);

	}
	
	@WithMockUser(value = "spring")
	@Test
	void testInitCreationForm() throws Exception {
		mockMvc.perform(get("/achievements")).andExpect(status().isOk())
		.andExpect(model().attributeExists("condition_unlocked"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
