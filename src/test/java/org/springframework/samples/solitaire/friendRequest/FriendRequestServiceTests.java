package org.springframework.samples.solitaire.friendRequest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.samples.solitaire.friendRequest.FriendRequest;
import org.springframework.samples.solitaire.friendRequest.FriendRequestService;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.samples.solitaire.player.PlayerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@DataJpaTest(includeFilters = @ComponentScan.Filter(Service.class))
public class FriendRequestServiceTests {

	@Autowired
	protected FriendRequestService friendRequestService;

	@Autowired
	protected PlayerService playerService;
	
	@Test
	void shouldRequestById() {
		FriendRequest request = this.friendRequestService.RequestById(1);
		Player playerSender = this.playerService.findPlayerById(1);
		assertThat(request.getPlayerSender().equals(playerSender));
	}

	@Test
	void shouldRequestByPlayerReceiverName() {
		Player playerReceiver = this.playerService.findPlayerById(2);
		Collection<FriendRequest> Collectionrequest = this.friendRequestService.RequestByPlayerReceiverName(playerReceiver.getUser().getUsername());
		FriendRequest request = this.friendRequestService.RequestById(1);
		assertThat(Collectionrequest.contains(request)).isTrue();
	}
	
	@Test
	void shouldRequestByPlayerSenderName() {
		Player playerSender = this.playerService.findPlayerById(1);
		Collection<FriendRequest> Collectionrequest = this.friendRequestService.RequestByPlayerSenderName(playerSender.getUser().getUsername());
		FriendRequest request = this.friendRequestService.RequestById(1);
		assertThat(Collectionrequest.contains(request)).isTrue();
	}
	
	@Test
	void shouldRequestPlayerSenderByPlayerReceiverName() {
		Player playerReceiver = this.playerService.findPlayerById(2);
		Player playerSender = this.playerService.findPlayerById(1);
		Collection<Player> collectionPlayer = this.friendRequestService.RequestPlayerSenderByPlayerReceiverName(playerReceiver.getUser().getUsername());
		assertThat(collectionPlayer.contains(playerSender)).isTrue();
	}
	
	@Test
	void shouldRequestByPlayerReceiverNameAndPlayerSenderName() {
		String usernamePlayerReceiver = this.playerService.findPlayerById(2).getUser().getUsername();
		String usernamePlayerSender = this.playerService.findPlayerById(1).getUser().getUsername();
		FriendRequest request = this.friendRequestService.RequestByPlayerReceiverNameAndPlayerSenderName(usernamePlayerReceiver, usernamePlayerSender);
		assertThat(request.getPlayerReceiver().getUser().getUsername().equals(usernamePlayerReceiver));
	}
	
	
	@Test
	@Transactional
	void shouldInsertFriendRequest() {
		List<FriendRequest> requests = this.friendRequestService.findAll();
		int found = requests.size();
		System.out.println(found);
		FriendRequest request = new FriendRequest();
		request.setPlayerReceiver(null);
		request.setPlayerSender(null);
		request.setState(false);
		
		this.friendRequestService.saveFriendRequest(request);
		assertThat(request.getId().longValue()).isNotEqualTo(1);
	}
	
	//Delete
	
	
	
	
	
	
	
	
	
	
	
	
	
}
