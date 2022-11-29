/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.samples.petclinic.player;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.friends.Friends;
import org.springframework.samples.petclinic.friends.FriendsService;
import org.springframework.samples.petclinic.user.AuthoritiesService;
import org.springframework.samples.petclinic.user.UserService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Juergen Hoeller
 * @author Ken Krebs
 * @author Arjen Poutsma
 * @author Michael Isvy
 */
@Controller
public class PlayerController {

	private static final String VIEWS_PLAYER_CREATE_OR_UPDATE_FORM = "players/createOrUpdatePlayerForm";
	private static final String VIEWS_MY_PROFILE = "players/myProfile";
	private static final String VIEWS_HOME = "welcome";
	
	private static final String VIEWS_FRIENDS = "friends/friendsList";
	
	private final FriendsService friendsService;
	private final PlayerService playerService;
	
	
	
	@Autowired
	public PlayerController(PlayerService playerService,FriendsService friendsService, UserService userService, AuthoritiesService authoritiesService) {
		this.playerService = playerService;
		this.friendsService = friendsService;
		
	}

	@InitBinder
	public void setAllowedFields(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
	}

	@GetMapping(value = "/players/new")
	public String initCreationForm(Map<String, Object> model) {
		Player player = new Player();
		model.put("player", player);
		return VIEWS_PLAYER_CREATE_OR_UPDATE_FORM;
	}

	@PostMapping(value = "/players/new")
	public String processCreationForm(@Valid Player player, BindingResult result) {
		if (result.hasErrors()) {
			return VIEWS_PLAYER_CREATE_OR_UPDATE_FORM;
		}
		else {
			//creating player, user and authorities
			this.playerService.savePlayer(player);
			
			return "redirect:/players/" + player.getId();
		}
	}

	@GetMapping(value = "/players/find")
	public String initFindForm(Player player,BindingResult result,Map<String, Collection<Player>> model) {
		// find players by last name
		// allow parameterless GET request for /players to return all records
		if (player.getLastName() == null) {
			player.setLastName(""); // empty string signifies broadest possible search
		}

		// find players by last name
		Collection<Player> results = this.playerService.findByLastName(player.getLastName());
		if (results.isEmpty()) {
			// no players found
			result.rejectValue("lastName", "notFound", "not found");
			return "players/findPlayers";
		}
		else if (results.size() == 1) {
			// 1 player found
			player = results.iterator().next();
			return "redirect:/players/" + player.getId();
		}
		else {
			// multiple players found
			model.put("selections", results);
			return "players/playersList";
		}
	}

	@GetMapping(value = "/players")
	public String processFindForm(Player player, BindingResult result, Map<String, Object> model) {

		// allow parameterless GET request for /players to return all records
		if (player.getLastName() == null) {
			player.setLastName(""); // empty string signifies broadest possible search
		}

		// find players by last name
		Collection<Player> results = this.playerService.findByLastName(player.getLastName());
		if (results.isEmpty()) {
			// no players found
			result.rejectValue("lastName", "notFound", "not found");
			return "players/findPlayers";
		}
		else if (results.size() == 1) {
			// 1 player found
			player = results.iterator().next();
			return "redirect:/players/" + player.getId();
		}
		else {
			// multiple players found
			model.put("selections", results);
			return "players/playersList";
		}
	}
	
	@GetMapping(value = "/players/{playerId}/edit")
	public String initUpdatePlayerForm(@PathVariable("playerId") int playerId, Model model) {
		Player player = this.playerService.findPlayerById(playerId);
		model.addAttribute(player);
		return VIEWS_PLAYER_CREATE_OR_UPDATE_FORM;
	}

	@PostMapping(value = "/players/{playerId}/edit")
	public String processUpdatePlayerForm(@Valid Player player, BindingResult result,
			@PathVariable("playerId") int playerId) {
		if (result.hasErrors()) {
			return VIEWS_PLAYER_CREATE_OR_UPDATE_FORM;
		}
		else {
			player.setId(playerId);
			this.playerService.savePlayer(player);
			return "redirect:/players/{playerId}";
		}
	}
	
	@GetMapping(value = "/players/{playerId}/delete")
	public String initDeletePlayerForm(@PathVariable("playerId") int playerId, Model model) {
		this.playerService.deletePlayer(this.playerService.findPlayerById(playerId));
		return VIEWS_HOME;
	}

	/**
	 * Custom handler for displaying an player.
	 * @param playerId the ID of the player to display
	 * @return a ModelMap with the model attributes for the view
	 */
	@GetMapping("/players/{playerId}")
	public ModelAndView showPlayer(@PathVariable("playerId") int playerId) {
		ModelAndView mav = new ModelAndView("players/playerDetails");
		mav.addObject(this.playerService.findPlayerById(playerId));
		return mav;
	}
	
	@GetMapping("/players/all")
	public ModelAndView showPlayerAll() {
		ModelAndView mav = new ModelAndView("players/playerDetails");
		mav.addObject(this.playerService.findAllPlayer());
		return mav;
	}
	
	@GetMapping(value = "/players/myProfile")
	public String initUpdatePlayerForm(Model model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		Player player = this.playerService.findByUsername(username);
		model.addAttribute(player);
		return VIEWS_MY_PROFILE;
	}

	@PostMapping(value = "/players/myProfile")
	public String processUpdatePlayerForm(BindingResult result) {
		if (result.hasErrors()) {
			return VIEWS_MY_PROFILE;
		}
		else {
			String username = SecurityContextHolder.getContext().getAuthentication().getName();
			Player player = this.playerService.findByUsername(username);
			player.setId(player.getId());
			this.playerService.savePlayer(player);
			return "redirect:/players/myProfile";
		}
	}
	
	@GetMapping(value = "/players/{playerId}/friends")
    public String initFriendsList(Map<String, Object> model) {
        String name = SecurityContextHolder.getContext().getAuthentication().getName();
        Friends friends = this.friendsService.findByName(name);
        List<Friends> Friends = new ArrayList<>();
        Friends.add(friends);
        model.put("Friends",friends);
        return VIEWS_FRIENDS;
    }
	


}