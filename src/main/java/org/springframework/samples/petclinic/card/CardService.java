package org.springframework.samples.petclinic.card;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CardService {

private CardRepository cardRepository;	

	@Autowired
	public CardService(CardRepository cardRepository) {
		this.cardRepository = cardRepository;
	}	

	@Transactional(readOnly = true)	
	public Collection<Card> findById(int id) throws DataAccessException {
		return cardRepository.findById(id);
	}	
	
	@Transactional(readOnly = true)	
	public List<Card> findAll() throws DataAccessException {
		return cardRepository.findAll();
	}

	@Transactional
	public void saveCard(Card card) throws DataAccessException {
		//creating card
		cardRepository.save(card);	
	}	
	

}
