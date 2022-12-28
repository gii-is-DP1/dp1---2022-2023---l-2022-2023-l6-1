package org.springframework.samples.solitaire.deck;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.samples.solitaire.card.Card;
import org.springframework.samples.solitaire.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "deck")
public class Deck extends BaseEntity {
	
	@Max(value = 24)
    @OneToMany(cascade = CascadeType.ALL)
    private List<Card> deckPlay;

    @Min(value = 1)
    @Max(value = 2)
    @Column(name = "numeroColumna")
    private Integer numeroColumna;
}