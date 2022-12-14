package org.springframework.samples.petclinic.card;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CardController {
	
	private static final String VIEWS_CARD_CREATE_OR_UPDATE_FORM = "cards/createOrUpdateCardForm";
	
	
	private final CardService cardService;  
	
	@Autowired
	public CardController(CardService cardService) {
		this.cardService = cardService;
	}
	 
	@GetMapping(value = "/cards/{cardId}/edit")
	public String initUpdateCardForm(@PathVariable("cardId") int cardId, Model model) {
		Collection<Card> card = this.cardService.findById(cardId);
		model.addAttribute(card);
		return VIEWS_CARD_CREATE_OR_UPDATE_FORM;
	}
   
	@PostMapping(value = "/cards/{cardId}/edit")
	public String processUpdateCardForm(@Valid Card card, BindingResult result,
			@PathVariable("cardId") int cardId) {
		if (result.hasErrors()) {
			return VIEWS_CARD_CREATE_OR_UPDATE_FORM;
		}
		else {
			card.setId(cardId);
			this.cardService.saveCard(card);
			return "redirect:/difficult1";
		}
	}

}
