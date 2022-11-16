package org.springframework.samples.petclinic.card;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.petclinic.util.EntityUtils;

import org.springframework.stereotype.Service;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class CardServiceTest {
	
	@Autowired
	protected CardService cardService;	

	@Test
	void shouldFindCards() {
		Collection<Card> card = this.cardService.findById(1);
				
		Card cards = EntityUtils.getById(card, Card.class, 1);
		assertThat(cards.getNumber()).isEqualTo(4);
	}


}
