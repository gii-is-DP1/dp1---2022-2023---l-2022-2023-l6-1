package org.springframework.samples.solitaire.card;

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
	public Card findCardById(int id) throws DataAccessException {
		return cardRepository.findCardById(id);
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
	
	@Transactional(readOnly = true)	
	public List<Card> findAllCardsBoardId(int id) throws DataAccessException{
		return cardRepository.findAllCardsBoardId(id);
	} 
	@Transactional(readOnly = true)	
	public List<Card> findAllCardsBoardIdfalse(int id) throws DataAccessException{
		return cardRepository.findAllCardsBoardIdFalse(id);
	}
	
	@Transactional(readOnly = true)
    public List<Card> findCardByPosition(int x) throws DataAccessException {
        return cardRepository.findCardByPosition(x);
    }

}
