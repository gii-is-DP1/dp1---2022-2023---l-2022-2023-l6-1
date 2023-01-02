package org.springframework.samples.solitaire.friends;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.samples.solitaire.player.PlayerService;
import org.springframework.stereotype.Service;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class FriendsServiceTests {

	@Autowired
	FriendsService friendsService;

	@Autowired
	PlayerService playerService;
	
	@Test
	void shouldRequestByPlayer() {
		Player player = this.playerService.findPlayerById(1);
		Collection<Friends> friends = this.friendsService.RequestByPlayer(player);
		assertThat(friends);

	}

	
}
