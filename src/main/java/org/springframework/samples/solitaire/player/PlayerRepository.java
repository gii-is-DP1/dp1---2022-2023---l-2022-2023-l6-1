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



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * Spring Data JPA OwnerRepository interface
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */

public interface PlayerRepository extends PagingAndSortingRepository<Player, Integer> {


	@Query("SELECT DISTINCT player FROM Player player WHERE player.lastName LIKE :lastName%")
	public Collection<Player> findByLastName(@Param("lastName") String lastName);
	
	@Query("SELECT player FROM Player player WHERE player.user.username= :username")
	public Player findByUsername(@Param("username") String username);

	@Query("SELECT player FROM Player player WHERE player.id =:id")
	public Player findById(@Param("id") int id);
	
	@Query("SELECT player FROM Player player")
	public Collection<Player> findAllPlayer();

	Page<Player> findAll(Pageable pageable);

	
}
