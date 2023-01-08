package org.springframework.samples.solitaire.card;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.solitaire.board.Board;
import org.springframework.samples.solitaire.util.EntityUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class CardServiceTests {
	
	@Autowired
    protected CardService cardService;

    @Test
    @Transactional
    void shouldFindCards() {
        Collection<Card> card = this.cardService.findById(14);

        Card cards = EntityUtils.getById(card, Card.class, 14);
        assertThat(cards.getNumber()).isEqualTo(1);
    }

    @Test
    @Transactional
    void shouldFindCardById() {
        Card card = this.cardService.findCardById(14);
        assertThat(card.getNumber()).isEqualTo(1);
    }
    
    @Test
    @Transactional
    void shouldFindAllCards() {
        Collection<Card> card = this.cardService.findAll();

        Card cards =  EntityUtils.getById(card, Card.class, 14);
        assertThat(cards.getNumber()).isEqualTo(1);
    }

    @Test
    @Transactional
    public void shouldSaveCards() {
        Collection<Card> cards = this.cardService.findById(1);
        int found = cards.size();
        System.out.println(found);
        Card card = new Card();
        card.setColor("RED");
        card.setSuit("DIAMONDS");
        card.setNumber(1);
        card.setXPosition(1);
        card.setYPosition(1);
        card.setIsShowed(true);

        this.cardService.saveCard(card);
        assertThat(card.getId().longValue()).isNotEqualTo(1);

        cards = this.cardService.findById(1);
        cards.add(card);
        assertThat(cards.size()).isEqualTo(found + 1);
    }
    
    @Test
    @Transactional
    void shouldFindAllCardBoardId() {
        List<Card> card = this.cardService.findAllCardsBoardId(1);
        assertThat(card.size()).isEqualTo(0);
    }
    
    @Test
    @Transactional
    void shouldFindAllCardBoardIdFalse() {
        List<Card> card = this.cardService.findAllCardsBoardIdfalse(1);
        assertThat(card.size()).isEqualTo(52);
    }
    
    @Test
    @Transactional
    void shouldFindCardByPosition() {
    	Card card = new Card();
        card.setColor("RED");
        card.setSuit("DIAMONDS");
        card.setNumber(1);
        card.setXPosition(1);
        card.setYPosition(1);
        card.setIsShowed(true);
        this.cardService.saveCard(card);
        List<Card> cards = this.cardService.findCardByPosition(1);
        
        assertThat(cards.size()).isEqualTo(1);
    }
    
    @Test
    @Transactional
    void shouldFindAllCardsVacia() {
    	Card card = new Card();
        card.setColor("RED");
        card.setSuit("DIAMONDS");
        card.setNumber(1);
        card.setXPosition(1);
        card.setYPosition(1);
        card.setIsShowed(true);
        this.cardService.saveCard(card);
        Card cards = this.cardService.findAllCardsVacia(1, 1);
        
        assertThat(cards.getNumber()).isEqualTo(1);
    }
    
    @Test
    @Transactional
    void shouldFindAllCardsDeck() {
        List<Card> cards = this.cardService.findAllCardsDeck(0, 0);
        assertThat(cards.size()).isEqualTo(52);
    }
}
