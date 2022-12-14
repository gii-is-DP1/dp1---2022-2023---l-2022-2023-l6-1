package org.springframework.samples.petclinic.card;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.petclinic.util.EntityUtils;
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
}
