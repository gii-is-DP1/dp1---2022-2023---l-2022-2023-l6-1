package org.springframework.samples.petclinic.board;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	private static final String VIEWS_BOARD = "board/createGame";
	
	@GetMapping(value = "/startGame")
	public String initCreationForm(Map<String, Object> model) {
		Board board = new Board();
		model.put("board", board);
		return VIEWS_BOARD;
	}

}
