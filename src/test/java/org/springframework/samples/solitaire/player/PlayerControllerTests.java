package org.springframework.samples.solitaire.player;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.assertj.core.util.Lists;
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
import org.springframework.samples.solitaire.statistics.Statistics;
import org.springframework.samples.solitaire.statistics.StatisticsService;
import org.springframework.samples.solitaire.user.AuthoritiesService;
import org.springframework.samples.solitaire.user.UserService;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = PlayerController.class, excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WebSecurityConfigurer.class), excludeAutoConfiguration = SecurityConfiguration.class)
public class PlayerControllerTests {
	
	private static final int TEST_PLAYER_ID = 1;

	@Autowired
	private PlayerController playerController;
	
	@MockBean
	@Autowired
	private StatisticsService statisticsService;

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

	private Player george;

	@BeforeEach
	void setup() {

		Statistics stat = new Statistics();
		stat.setGames(120);
		stat.setGamesLost(20);
		stat.setGamesWon(100);
		stat.setPlayer(george);
		stat.setId(100);
		stat.setTotalScore(200);
		this.statisticsService.saveStatistics(stat);
		george = new Player();
		george.setId(TEST_PLAYER_ID);
		george.setFirstName("George");
		george.setLastName("Franklin");
		george.setEmail("george@gmail.com");
		george.setFriendId(1);
		given(this.statisticsService.findById(TEST_PLAYER_ID)).willReturn(stat);
		given(this.playerService.findPlayerById(TEST_PLAYER_ID)).willReturn(george);

	}

	@WithMockUser(value = "spring")
	@Test
	void testInitCreationForm() throws Exception {
		mockMvc.perform(get("/players/new")).andExpect(status().isOk()).andExpect(model().attributeExists("player"))
				.andExpect(view().name("players/createOrUpdatePlayerForm"));
	}

	@WithMockUser(value = "spring")
	@Test
	void testProcessCreationFormSuccess() throws Exception {
		mockMvc.perform(post("/players/new").param("firstName", "Joe").param("lastName", "Bloggs").with(csrf())
				.param("email", "joe@gmail.com").param("username", "Joe2").param("Password", "Joe1"))
				.andExpect(status().is3xxRedirection());
	}

	@WithMockUser(value = "spring")
	@Test
	void testProcessCreationFormHasErrors() throws Exception {
		mockMvc.perform(post("/players/new").with(csrf()).param("firstName", "Joe").param("lastName", "Bloggs")
				.param("email", "georgemail.com")).andExpect(status().isOk()).andExpect(model().attributeHasErrors("player"))
				.andExpect(view().name("players/createOrUpdatePlayerForm"));
	}

	@WithMockUser(value = "spring")
	@Test
	void testInitFindForm() throws Exception {
		mockMvc.perform(get("/players/find")).andExpect(status().isOk()).andExpect(model().attributeExists("player"))
				.andExpect(view().name("players/findPlayers"));
	}

	@WithMockUser(value = "spring")
	@Test
	void testProcessFindFormSuccess() throws Exception {
		given(this.playerService.findByLastName("")).willReturn(Lists.newArrayList(george, new Player()));

		mockMvc.perform(get("/players")).andExpect(status().isOk()).andExpect(view().name("players/playersList"));
	}

	@WithMockUser(value = "spring")
	@Test
	void testProcessFindFormByLastName() throws Exception {
		given(this.playerService.findByLastName(george.getLastName())).willReturn(Lists.newArrayList(george));

		mockMvc.perform(get("/players").param("lastName", "Franklin")).andExpect(status().is3xxRedirection())
				.andExpect(view().name("redirect:/players/" + TEST_PLAYER_ID));
	}

	@WithMockUser(value = "spring")
	@Test
	void testProcessFindFormNoPlayersFound() throws Exception {
		mockMvc.perform(get("/players").param("lastName", "Unknown Surname")).andExpect(status().isOk())
				.andExpect(model().attributeHasFieldErrors("player", "lastName"))
				.andExpect(model().attributeHasFieldErrorCode("player", "lastName", "notFound"))
				.andExpect(view().name("players/findPlayers"));
	}

	@WithMockUser(value = "spring")
	@Test
	void testInitUpdatePlayerForm() throws Exception {
		mockMvc.perform(get("/players/{playerId}/edit", TEST_PLAYER_ID)).andExpect(status().isOk())
				.andExpect(model().attributeExists("player"))
				.andExpect(model().attribute("player", hasProperty("lastName", is("Franklin"))))
				.andExpect(model().attribute("player", hasProperty("firstName", is("George"))))
				.andExpect(model().attribute("player", hasProperty("email", is("george@gmail.com"))))
				.andExpect(view().name("players/createOrUpdatePlayerForm"));
	}

	@WithMockUser(value = "spring")
	@Test
	void testProcessUpdatePlayerFormSuccess() throws Exception {
		mockMvc.perform(post("/players/{playerId}/edit", TEST_PLAYER_ID).with(csrf()).param("firstName", "Joe")
				.param("lastName", "Bloggs").param("email", "george1@gmail.com")).andExpect(status().isOk());
	}

	@WithMockUser(value = "spring")
	@Test
	void testProcessUpdatePlayerFormHasErrors() throws Exception {
		mockMvc.perform(post("/players/{playerId}/edit", TEST_PLAYER_ID).with(csrf()).param("firstName", "Joe")
				.param("lastName", "Bloggs").param("email", "georgegmail.com.")).andExpect(status().isOk())
				.andExpect(model().attributeHasErrors("player"))
				.andExpect(view().name("players/createOrUpdatePlayerForm"));
	}

	@WithMockUser(value = "spring")
	@Test
	void testShowPlayer() throws Exception {
		mockMvc.perform(get("/players/{playerId}", TEST_PLAYER_ID)).andExpect(status().isOk())
				.andExpect(model().attribute("player", hasProperty("lastName", is("Franklin"))))
				.andExpect(model().attribute("player", hasProperty("firstName", is("George"))))
				.andExpect(model().attribute("player", hasProperty("email", is("george@gmail.com"))))
				.andExpect(view().name("players/playerDetails"));
	}

}