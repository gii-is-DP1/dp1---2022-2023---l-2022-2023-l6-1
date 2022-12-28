package org.springframework.samples.solitaire.player;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.samples.solitaire.player.PlayerService;
import org.springframework.samples.solitaire.user.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class PlayerServiceTests {
	  @Autowired
		protected PlayerService playerService;

		@Test
		void shouldFindPlayersByLastName() {
			Collection<Player> players = this.playerService.findByLastName("Casas");
			assertThat(players.size()).isEqualTo(1);

			players = this.playerService.findByLastName("Casas");
			assertThat(players.isEmpty()).isFalse();
		}

		@Test
		void shouldFindSinglePlayer() {
			Player player = this.playerService.findPlayerById(1);
			assertThat(player.getLastName()).startsWith("Casas");
		}
		
		@Test
		void shouldFindSinglePlayerByUsername() {
			Player player = this.playerService.findByUsername("player1");
			assertThat(player.getUser().getUsername()).startsWith("player1");
		}

		@Test
		@Transactional
		public void shouldInsertPlayer() {
			Collection<Player> players = this.playerService.findByLastName("Schultz");
			int found = players.size();

			Player player = new Player();
			player.setFirstName("Sam");
			player.setLastName("Schultz");
			player.setEmail("sam@gmail.com");
	                User user=new User();
	                user.setUsername("Sam");
	                user.setPassword("supersecretpassword");
	                user.setEnabled(true);
	                player.setUser(user);                
	                
			this.playerService.savePlayer(player);
			assertThat(player.getId().longValue()).isNotEqualTo(0);

			players = this.playerService.findByLastName("Schultz");
			assertThat(players.size()).isEqualTo(found + 1);
		}

		@Test
		@Transactional
		void shouldUpdatePlayer() {
			Player player = this.playerService.findPlayerById(1);
			String oldLastName = player.getLastName();
			String newLastName = oldLastName + "X";

			player.setLastName(newLastName);
			this.playerService.savePlayer(player);

			// retrieving new name from database
			player = this.playerService.findPlayerById(1);
			assertThat(player.getLastName()).isEqualTo(newLastName);
		}
		
		@Test
		@Transactional
		void shouldUpdatePlayerFirstname() {
			Player player = this.playerService.findPlayerById(1);
			String oldLastName = player.getFirstName();
			String newLastName = oldLastName + "pedrito";

			player.setFirstName(newLastName);
			this.playerService.savePlayer(player);

			// retrieving new name from database
			player = this.playerService.findPlayerById(1);
			assertThat(player.getFirstName()).isEqualTo(newLastName);
		}
		
		
		
}
