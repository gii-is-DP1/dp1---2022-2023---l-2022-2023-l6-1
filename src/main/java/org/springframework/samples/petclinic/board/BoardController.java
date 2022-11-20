package org.springframework.samples.petclinic.board;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	private static final String VIEWS_BOARD = "board/chooseDifficult";
	private static final String BOARD_1 = "board/board1";
	private static final String BOARD_2 = "board/board2";
	private static final String BOARD_3 = "board/board3";

	
	@GetMapping(value = "/startGame")
	public String initCreationForm(Map<String, Object> model) {
		Board board = new Board();
		model.put("board", board);
		return VIEWS_BOARD;
	}
	
	@GetMapping(value = "/startGame/difficult1")
	public String creationEasyMode(Map<String, Object> model) {
		Board board = new Board();
		model.put("board", board);
		return BOARD_1;
	}
	
	@GetMapping(value = "/startGame/difficult2")
	public String creationMediumMode(Map<String, Object> model) {
		Board board = new Board();
		model.put("board", board);
		return BOARD_2;
	}
	
	@GetMapping(value = "/startGame/difficult3")
	public String creationHardMode(Map<String, Object> model) {
		Board board = new Board();
		model.put("board", board);
		return BOARD_3;
	}
	
	

}