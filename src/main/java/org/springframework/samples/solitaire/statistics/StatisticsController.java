package org.springframework.samples.solitaire.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.solitaire.player.Player;
import org.springframework.samples.solitaire.player.PlayerService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StatisticsController {

	
	private static final String VIEWS_STATISTICS = "statistics/myStatistics";
	
	private final StatisticsService statisticsService;
	private final PlayerService playerService;
	@Autowired
	public StatisticsController(StatisticsService statisticsService,PlayerService playerService) {
		this.statisticsService = statisticsService;
		this.playerService = playerService;
	}
	
	@InitBinder
	public void setAllowedFields(WebDataBinder dataBinder) {
		dataBinder.setDisallowedFields("id");
	}
	

	
	@GetMapping(value = "/statistics")
	public String initCreationForm(Map<String, Object> model) {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		Player player = this.playerService.findByUsername(username);
		Integer id = player.getId();
		Statistics stats = this.statisticsService.findById(id);
		List<Statistics> statistics = new ArrayList<>();
		statistics.add(stats);
		model.put("statistics",statistics);
		return VIEWS_STATISTICS;
	}
	
	@GetMapping(value = "/statistics/{playerId}")
	public String initStatsForm(@PathVariable("playerId") int playerId, Map<String, Object> model) {
		Player player = this.playerService.findPlayerById(playerId);
		Integer id = player.getId();
		Statistics stats = this.statisticsService.findById(id);
		List<Statistics> statistics = new ArrayList<>();
		statistics.add(stats);
		model.put("statistics",statistics);
		return "statistics/friendsStatistics";
	}
	
	
	
	
}
