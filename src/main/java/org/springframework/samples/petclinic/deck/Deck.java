package org.springframework.samples.petclinic.deck;

import org.springframework.samples.petclinic.model.BaseEntity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.samples.petclinic.card.Card;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "deck")
public class Deck extends BaseEntity {

    @OneToMany(mappedBy = "deck", fetch = FetchType.EAGER)
    private List<Card> deckPlay;

    @Min(value = 1)
    @Max(value = 2)
    @Column(name = "numeroColumna")
    private Integer numeroColumna;
}