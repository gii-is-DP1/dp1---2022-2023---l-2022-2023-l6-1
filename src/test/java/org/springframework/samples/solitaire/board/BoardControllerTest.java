package org.springframework.samples.solitaire.board;

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
import org.springframework.samples.solitaire.board.Board;
import org.springframework.samples.solitaire.board.BoardController;
import org.springframework.samples.solitaire.board.BoardService;
import org.springframework.samples.solitaire.configuration.SecurityConfiguration;
import org.springframework.samples.solitaire.friendRequest.FriendRequestService;
import org.springframework.samples.solitaire.friends.FriendsService;
import org.springframework.samples.solitaire.user.AuthoritiesService;
import org.springframework.samples.solitaire.user.UserService;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = BoardController.class, excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = WebSecurityConfigurer.class), excludeAutoConfiguration = SecurityConfiguration.class)
public class BoardControllerTest {
	
	private static final int TEST_BOARD_ID = 1;

	@Autowired
	private BoardController boardController;

	@MockBean
	private BoardService boardService;

	@MockBean
	private UserService userService;

	@MockBean
	private AuthoritiesService authoritiesService;

	@Autowired
	private MockMvc mockMvc;

	private Board board;

//	@BeforeEach
//	void setup() {
//
//		board = new Board();
//		board.setId(TEST_BOARD_ID);
//		given(this.boardService.findById(TEST_BOARD_ID)).willReturn(board);
//
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testInitCreationForm() throws Exception {
//		mockMvc.perform(get("/boards/new")).andExpect(status().isOk()).andExpect(model().attributeExists("board"))
//				.andExpect(view().name("boards/createOrUpdateBoardForm"));
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testProcessCreationFormSuccess() throws Exception {
//		mockMvc.perform(post("/boards/new").param("firstName", "Joe").param("lastName", "Bloggs").with(csrf())
//				.param("email", "joe@gmail.com").param("username", "Joe2").param("Password", "Joe1"))
//				.andExpect(status().is3xxRedirection());
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testProcessCreationFormHasErrors() throws Exception {
//		mockMvc.perform(post("/boards/new").with(csrf()).param("firstName", "Joe").param("lastName", "Bloggs")
//				.param("email", "georgemail.com")).andExpect(status().isOk()).andExpect(model().attributeHasErrors("board"))
//				.andExpect(view().name("boards/createOrUpdateBoardForm"));
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testInitFindForm() throws Exception {
//		mockMvc.perform(get("/boards/find")).andExpect(status().isOk()).andExpect(model().attributeExists("board"))
//				.andExpect(view().name("boards/findBoards"));
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testProcessFindFormSuccess() throws Exception {
//		given(this.boardService.findByLastName("")).willReturn(Lists.newArrayList(george, new Board()));
//
//		mockMvc.perform(get("/boards")).andExpect(status().isOk()).andExpect(view().name("boards/boardsList"));
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testProcessFindFormByLastName() throws Exception {
//		given(this.boardService.findByLastName(george.getLastName())).willReturn(Lists.newArrayList(george));
//
//		mockMvc.perform(get("/boards").param("lastName", "Franklin")).andExpect(status().is3xxRedirection())
//				.andExpect(view().name("redirect:/boards/" + TEST_PLAYER_ID));
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testProcessFindFormNoBoardsFound() throws Exception {
//		mockMvc.perform(get("/boards").param("lastName", "Unknown Surname")).andExpect(status().isOk())
//				.andExpect(model().attributeHasFieldErrors("board", "lastName"))
//				.andExpect(model().attributeHasFieldErrorCode("board", "lastName", "notFound"))
//				.andExpect(view().name("boards/findBoards"));
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testInitUpdateBoardForm() throws Exception {
//		mockMvc.perform(get("/boards/{boardId}/edit", TEST_PLAYER_ID)).andExpect(status().isOk())
//				.andExpect(model().attributeExists("board"))
//				.andExpect(model().attribute("board", hasProperty("lastName", is("Franklin"))))
//				.andExpect(model().attribute("board", hasProperty("firstName", is("George"))))
//				.andExpect(model().attribute("board", hasProperty("email", is("george@gmail.com"))))
//				.andExpect(view().name("boards/createOrUpdateBoardForm"));
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testProcessUpdateBoardFormSuccess() throws Exception {
//		mockMvc.perform(post("/boards/{boardId}/edit", TEST_PLAYER_ID).with(csrf()).param("firstName", "Joe")
//				.param("lastName", "Bloggs").param("email", "george1@gmail.com")).andExpect(status().is3xxRedirection())
//				.andExpect(view().name("redirect:/boards/{boardId}"));
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testProcessUpdateBoardFormHasErrors() throws Exception {
//		mockMvc.perform(post("/boards/{boardId}/edit", TEST_PLAYER_ID).with(csrf()).param("firstName", "Joe")
//				.param("lastName", "Bloggs").param("email", "georgegmail.com.")).andExpect(status().isOk())
//				.andExpect(model().attributeHasErrors("board"))
//				.andExpect(view().name("boards/createOrUpdateBoardForm"));
//	}
//
//	@WithMockUser(value = "spring")
//	@Test
//	void testShowBoard() throws Exception {
//		mockMvc.perform(get("/boards/{boardId}", TEST_PLAYER_ID)).andExpect(status().isOk())
//				.andExpect(model().attribute("board", hasProperty("lastName", is("Franklin"))))
//				.andExpect(model().attribute("board", hasProperty("firstName", is("George"))))
//				.andExpect(model().attribute("board", hasProperty("email", is("george@gmail.com"))))
//				.andExpect(view().name("boards/boardDetails"));
//	}
//
}