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
package org.springframework.samples.solitaire.player;

import java.util.Collection;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.solitaire.statistics.Statistics;
import org.springframework.samples.solitaire.statistics.StatisticsService;
import org.springframework.samples.solitaire.user.AuthoritiesService;
import org.springframework.samples.solitaire.user.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Mostly used as a facade for all Petclinic controllers Also a placeholder
 * for @Transactional and @Cacheable annotations
 *
 * @author Michael Isvy
 */
@Service
public class PlayerService {
	
	private PlayerRepository playerRepository;	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AuthoritiesService authoritiesService;
	
	@Autowired
	private StatisticsService statisticsService;

	@Autowired
	public PlayerService(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}	

	@Transactional(readOnly = true)
	public Collection<Player> findAllPlayer() throws DataAccessException {
		return playerRepository.findAllPlayer();
	}
	
	
	
	@Transactional(readOnly = true)
	public Player findPlayerById(int id) throws DataAccessException {
		return playerRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public Player findByUsername(String username) throws DataAccessException {
		return playerRepository.findByUsername(username);
	}
	
	
	@Transactional(readOnly = true)
	public Collection<Player> findByLastName(String lastName) throws DataAccessException {
		return playerRepository.findByLastName(lastName);
	}

	@Transactional
	public void savePlayer(Player player) throws DataAccessException {
		//creating player
		playerRepository.save(player);	
		//creating user
		userService.saveUser(player.getUser());
		//creating authorities
		authoritiesService.saveAuthorities(player.getUser().getUsername(), "player");
		//creating statistics
		Statistics statistics = new Statistics();
		statistics.setGames(0);
		statistics.setGamesLost(0);
		statistics.setGamesWon(0);
		statistics.setTotalScore(0);
		statistics.setPlayer(player);
		statisticsService.saveStatistics(statistics);
	}	
	
	@Transactional
	public void deletePlayer(Player player) throws DataAccessException {
		//deleting player
		playerRepository.delete(player);	
		
	}	
	



}