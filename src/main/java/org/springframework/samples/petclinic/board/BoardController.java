package org.springframework.samples.petclinic.board;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.card.Card;
import org.springframework.samples.petclinic.card.CardService;
import org.springframework.samples.petclinic.playZone.PlayZone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	private static final String VIEWS_BOARD = "board/chooseDifficult";
	private static final String BOARD_1 = "board/board1";
	private static final String BOARD_2 = "board/board2";
	private static final String BOARD_3 = "board/board3";
	
	@Autowired
	BoardService boardService;
	@Autowired
	CardService cardService;


	@GetMapping(value = "/startGame")
	public String initCreationForm(Map<String, Object> model) {
		Board board = new Board();
		model.put("board", board);
		model.put("playzone", inicioPartida());
		return VIEWS_BOARD;
	}
	
	@GetMapping(value = "/difficult1")
	public String creationEasyMode(Map<String, Object> model, HttpServletResponse response) {
		response.addHeader("Refresh", "3");
		model.put("now", new Date());
		model.put("board", boardService.findById(1).get());
		return BOARD_1;
	}
	
	@GetMapping(value = "/difficult2")
	public String creationMediumMode(Map<String, Object> model) {
		Board board = new Board();
		model.put("board", board);
		return BOARD_2;
	}
	
	@GetMapping(value = "/difficult3")
	public String creationHardMode(Map<String, Object> model) {
		Board board = new Board();
		model.put("board", board);
		return BOARD_3;
	}
	
	
//	====================================Play=================================================================
	//pincho la carta que quiero mover -> seleciono el lugar dnd quiero que vaya
	
//	@GetMapping(value = "/${cardId}")
//	public void selectCard(@PathVariable("cardId") int cardId) {
//		
//	}
//	
//	
//	@GetMapping(value = "/${cardId}")
//	public void moveCard(@PathVariable("cardId") int cardId, Integer x, Integer y, Integer z) {
//		
//	}
//	@GetMapping(value = "/${cardId}")
//	public void vistaCarta(@PathVariable("cardId") int cardId) {
//		Card card = new Card();
//		card.setId(cardId);
//		if(card.getIsShowed() == false) {
//			card.
//		}
//		
//	}
	
//	====================================PlayZone=================================================================
	
	public PlayZone inicioPartida() {
		List<Card> cards = cardService.findAll();
		Card cardAux = new Card();
		PlayZone playzone = new PlayZone();
		List<Card> listaAuxResultado = new ArrayList<>();
		for(int c = 1; c<8;c++) {
			Integer nF = 1;
			for(int f = 1; f<8;f++) {
				if(nF == c ) {
					Random numRandom = new Random();
					cardAux = cards.get(numRandom.nextInt(cards.size()+1));
					cards.remove(cardAux);
					cardAux.setIsShowed(true);
					cardAux.setXPosition(c);
					cardAux.setYPosition(f);
					cardService.saveCard(cardAux);
					listaAuxResultado.add(cardAux);
					
					break;
				}else {
					Random numRandom = new Random();
					cardAux = cards.get(numRandom.nextInt(cards.size()+1));
					cards.remove(cardAux);
					cardAux.setIsShowed(false);
					cardAux.setXPosition(c);
					cardAux.setYPosition(f);
					cardService.saveCard(cardAux);
					listaAuxResultado.add(cardAux);
					nF++;
				}
			}
		}
		playzone.setPlayZoneCard(listaAuxResultado);
		return playzone;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
