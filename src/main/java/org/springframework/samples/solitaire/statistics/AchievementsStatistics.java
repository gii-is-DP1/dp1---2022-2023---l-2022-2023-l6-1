package org.springframework.samples.solitaire.statistics;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.solitaire.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "achievements_statistics")
public class AchievementsStatistics extends BaseEntity{
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "achievement_id", referencedColumnName = "id")
	private Achievements achievement;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "statistics_id", referencedColumnName = "id")
	private Statistics statistics;
	

}
