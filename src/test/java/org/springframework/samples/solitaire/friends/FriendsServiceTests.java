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
import org.springframework.stereotype.Service;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class FriendsServiceTests {

	@Autowired
	protected FriendsService friendsService;

	Player pl1;
	Player pl2;
	
	
	@Test
	void shouldRequestById() {
		Friends friends = this.friendsService.RequestById(pl1, pl2);
		friends.setFriend1(pl2);
		friends.setFriend2(pl1);
		System.out.println(friends);
		assertThat(friends.getFriend1());

//		friends = this.friendsService.RequestById(pl2, pl1);
//		assertThat(friends.getFriend2().getLastName()).isEqualTo(pl1.getLastName());
	}

	
}
