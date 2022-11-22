package org.springframework.samples.petclinic.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.player.Player;
import org.springframework.samples.petclinic.player.PlayerService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AchievementsController {
	
	private static final String VIEWS_ACHIEVEMENTS = "achievements/myAchievements";
	
	private final AchievementsService achievementsService;
	private final StatisticsService statisticsService;
	private final PlayerService playerService;

	
	@Autowired
	public AchievementsController(AchievementsService achievementsService, StatisticsService statisticsService, PlayerService playerService) {
		this.achievementsService = achievementsService;
		this.statisticsService = statisticsService;
		this.playerService = playerService;
	} 

	@GetMapping(value = "/achievements")
	public String initCreationForm(Map<String, Object> model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		Player player = this.playerService.findByUsername(username);
		Integer id = player.getId();
		Statistics stats = this.statisticsService.findById(id);
		Integer id_stats = stats.getId();
		Achievements achievement = this.achievementsService.findById(id_stats);
		List<Achievements> achievements = new ArrayList<>();
		achievements.add(achievement);
		model.put("achievements",achievements);
		return VIEWS_ACHIEVEMENTS;
	}
}
