package org.springframework.samples.solitaire.friends;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.solitaire.friendRequest.FriendRequest;
import org.springframework.samples.solitaire.friends.Friends;
import org.springframework.samples.solitaire.friends.FriendsService;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.samples.solitaire.player.PlayerService;
import org.springframework.samples.solitaire.user.User;
import org.springframework.samples.solitaire.user.UserService;
import org.springframework.stereotype.Service;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class FriendsServiceTests {

	@Autowired
	protected FriendsService friendsService;

	@Autowired
	protected PlayerService playerService;
	
	@Test
	void shouldRequestById() {
		Player player = new Player();
		player.setFirstName("Sam");
		player.setLastName("Schultz");
		player.setEmail("sam@gmail.com");
		player.setId(11);
		User user=new User();
        user.setUsername("Sam");
        user.setPassword("supersecretpassword");
        user.setEnabled(true);
        player.setUser(user);
        
		Player player2 = new Player();
		player2.setFirstName("PEdro");
		player2.setLastName("pele");
		player2.setEmail("pele@gmail.com");
		player2.setId(12);
		User user2=new User();
        user2.setUsername("PEdro");
        user2.setPassword("supersecretpassword");
        user2.setEnabled(true);
        player2.setUser(user2);
		
		Friends friends = this.friendsService.RequestById(player, player2);
		assertThat(friends.getFriend1().equals(player));

	}

	
}
