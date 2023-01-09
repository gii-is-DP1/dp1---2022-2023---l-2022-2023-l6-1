package org.springframework.samples.solitaire.board;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.samples.solitaire.card.Card;
import org.springframework.samples.solitaire.card.CardService;
import org.springframework.samples.solitaire.configuration.SecurityConfiguration;
import org.springframework.samples.solitaire.user.AuthoritiesService;
import org.springframework.samples.solitaire.user.UserService;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(controllers = BoardController.class, excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WebSecurityConfigurer.class), excludeAutoConfiguration = SecurityConfiguration.class)
public class BoardControllerTest {
	
	private static final int TEST_BOARD_ID = 2;

	@Autowired
	@MockBean
	private BoardController boardController;

	@MockBean
	private CardService cardService;
	
	@MockBean
	private BoardService boardService;

	@MockBean
	private UserService userService;

	@MockBean
	private AuthoritiesService authoritiesService;

	@Autowired
	private MockMvc mockMvc;


	
	@BeforeEach
	void setup() {

		Board board = new Board();
		board.setId(TEST_BOARD_ID);
		board.setBackground("/resources/images/background.jpg");
		board.setWidth(960);
		board.setHeight(2500);
		this.boardService.save(board);
		Card card = new Card();
		card.setId(100);
		card.setNumber(2);
		this.cardService.saveCard(card);
		given(this.boardService.findById(TEST_BOARD_ID)).willReturn(board);

	}



	

	@WithMockUser(value = "spring")
	@Test
	void testYouWinForm() throws Exception {
		mockMvc.perform(get("/board/youwin")).andExpect(status().isOk())
				.andExpect(view().name("board/youwin"));
	}

	@WithMockUser(value = "spring")
	@Test
	void testGiveUpForm() throws Exception {
		mockMvc.perform(get("/board/giveup")).andExpect(status().isOk())
				.andExpect(view().name("board/giveup"));
	}
	
	@WithMockUser(value = "spring")
	@Test
	void testinitUpdateCardForm() throws Exception {
		mockMvc.perform(get("/card/{cardId}/edit", 100)).andExpect(status().isOk())
				.andExpect(view().name("card/100/edit"))
				;
	}
	
	@WithMockUser(value = "spring")
	@Test
	void testprocessUpdateCardForm() throws Exception {
		mockMvc.perform(post("/card/{cardId}/edit",100).with(csrf()).param("id", "101")).andExpect(status().isOk());
	}


	@WithMockUser(value = "spring")
	@Test
	void testInitCreationGameForm() throws Exception {
		mockMvc.perform(get("/startGame")).andExpect(status().isOk())
				.andExpect(view().name("startGame"));
	}

	
	

}